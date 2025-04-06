package com.multitaste.api.utils.specifications;

import com.multitaste.api.entities.Product;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Supplier;

public class ProductSpecification {
    public static Specification<Product> createDynamicSpecification(
            String name, String category
    ) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            addPredicateIfNotEmpty(name, predicates,
                    () -> criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%" + name.toLowerCase() + "%"));

            addPredicateIfNotEmpty(category, predicates,
                    () -> criteriaBuilder.equal(root.get("category").get("slug"), category));

            return predicates.isEmpty() ? criteriaBuilder.conjunction() : criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }

    private static <T> void addPredicateIfNotEmpty(T value, List<Predicate> predicates, Supplier<Predicate> predicateSupplier) {
        if (value instanceof String && StringUtils.hasText((String) value)) {
            predicates.add(predicateSupplier.get());
        } else if (value instanceof List && !CollectionUtils.isEmpty((List<?>) value)) {
            predicates.add(predicateSupplier.get());
        }
    }
}
