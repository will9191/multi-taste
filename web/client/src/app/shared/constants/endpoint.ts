const BASE_URL = 'http://localhost:8080';

export const ApiEndpoint = {
  Category: {
    base: `${BASE_URL}/category-service/category`,
  },
  Customization: {
    base: `${BASE_URL}/customization-service/customization`,
  },
  Product: {
    base: `${BASE_URL}/product-service/product`,
  },
  Combo: {
    base: `${BASE_URL}/combo-service/combo`,
  },
};
