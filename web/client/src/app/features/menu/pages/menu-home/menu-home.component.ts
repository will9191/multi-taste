import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../../../category/category.service';
import { ProductService } from '../../../product/product.service';
import { CommonModule } from '@angular/common';
import { Meta, Title } from '@angular/platform-browser';

@Component({
  selector: 'app-menu-home',
  imports: [CommonModule],
  templateUrl: './menu-home.component.html',
  styleUrl: './menu-home.component.scss',
})
export class MenuHomeComponent implements OnInit {
  constructor(
    private categoryService: CategoryService,
    private productService: ProductService,
    private titleService: Title,
    private metaService: Meta
  ) {}

  ngOnInit(): void {
    this.getCategories();
    this.getProducts();
  }

  categorySelected = {
    name: 'Burgers',
    slug: 'burgers',
    id: 1,
  };

  categories: any;

  getCategories() {
    this.categoryService.getAllByStoreId(1).subscribe({
      next: (data: any) => {
        this.categories = data;
        console.log(data);
      },
    });
  }

  products: any;

  getProducts() {
    this.productService.getProductsByStoreAndCategory("bauru-00", "mode", this.categorySelected.slug).subscribe({  
      next: (data: any) => {
        this.products = data;
        console.log(data);

        this.titleService.setTitle(`${this.categorySelected.name} | Multi Taste`);
        this.metaService.updateTag({
          name: 'description',
          content: `See ${this.categorySelected.name} with the best prices.`
        })
      },
    });
  }
}
