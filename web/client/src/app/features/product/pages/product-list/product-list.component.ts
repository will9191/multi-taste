import { Component, OnInit } from '@angular/core';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { MatDialog } from '@angular/material/dialog';
import { MySearchFieldComponent } from '../../../../shared/components/my-search-field/my-search-field.component';
import { DeleteModalComponent } from '../../../../shared/components/delete-modal/delete-modal.component';
import { ProductService } from '../../product.service';
import { NewProductComponent } from '../new-product/new-product.component';
import { CreateButtonComponent } from '../../../../shared/components/buttons/create-button/create-button.component';
import { CommonModule } from '@angular/common';
import { InfoButtonComponent } from '../../../../shared/components/buttons/info-button/info-button.component';
import { ProductDetailsComponent } from '../product-details/product-details.component';

@Component({
  selector: 'app-product-list',
  imports: [
    ViewButtonComponent,
    InfoButtonComponent,
    ShareButtonComponent,
    DeleteButtonComponent,
    MySearchFieldComponent,
    CreateButtonComponent,
    CommonModule,
    InfoButtonComponent,
  ],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.scss',
})
export class ProductListComponent implements OnInit {
  constructor(
    private productService: ProductService,
    private matDialog: MatDialog
  ) {}

  products: any = [];

  ngOnInit(): void {
    this.productService.findAll().subscribe({
      next: (data: any) => {
        this.products = data;
      },
    });
  }

  new() {
    const newDialog = this.matDialog.open(NewProductComponent, {
      minWidth: '60vw',
    });
  }

  delete(id: number, img: string, name: string) {
    const dialog = this.matDialog.open(DeleteModalComponent, {
      data: { id, img, name },
    });

    dialog.afterClosed().subscribe((result) => {
      if (result) {
        this.productService.delete(id).subscribe({
          next: () => {
            console.log('product deleted');
          },
        });
      }
    });
  }

  seeInfo(product: any) {
    const dialog = this.matDialog.open(ProductDetailsComponent, {
      data: product,
    });
  }
}
