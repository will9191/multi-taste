import { Component, OnInit } from '@angular/core';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { EditButtonComponent } from '../../../../shared/components/buttons/edit-button/edit-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { MatDialog } from '@angular/material/dialog';

import { MySearchFieldComponent } from '../../../../shared/components/my-search-field/my-search-field.component';
import { DeleteModalComponent } from '../../../../shared/components/delete-modal/delete-modal.component';
import { ProductService } from '../../product.service';
import { NewProductComponent } from '../new-product/new-product.component';
import { CreateButtonComponent } from "../../../../shared/components/buttons/create-button/create-button.component";

@Component({
  selector: 'app-product-list',
  imports: [
    ViewButtonComponent,
    EditButtonComponent,
    ShareButtonComponent,
    DeleteButtonComponent,
    MySearchFieldComponent,
    CreateButtonComponent
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
    const newDialog = this.matDialog.open(NewProductComponent);
  }

  delete(id: number, img: string, name: string) {
    const deleteDialog = this.matDialog.open(DeleteModalComponent, {
      data: { id, img, name },
    });

    deleteDialog.afterClosed().subscribe((result) => {
      if (result) {
        this.productService.delete(id).subscribe({
          next: () => {
            console.log('product deleted');
          },
        });
      }
    });
  }
}
