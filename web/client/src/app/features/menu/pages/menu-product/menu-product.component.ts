import { Component } from '@angular/core';
import { CategoryService } from '../../../category/category.service';
import { ProductService } from '../../../product/product.service';
import { FillButtonComponent } from '../../../../shared/components/buttons/fill-button/fill-button.component';
import { QuantitySelectionComponent } from '../../../../shared/components/quantity-selection/quantity-selection.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-menu-product',
  imports: [FillButtonComponent, QuantitySelectionComponent, CommonModule],
  templateUrl: './menu-product.component.html',
  styleUrl: './menu-product.component.scss',
})
export class MenuProductComponent {
  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.getProduct();
  }

  product: any;

  getProduct() {
    this.productService
      .getProductByStoreAndCategory(
        'bauru-00',
        'mode',
        'burgers',
        'monster-burger'
      )
      .subscribe({
        next: (data: any) => {
          this.product = data;
          console.log(data);
        },
      });
  }

  modalOpen: boolean = false;
}
