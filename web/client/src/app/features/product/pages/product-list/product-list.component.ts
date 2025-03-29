import { Component } from '@angular/core';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { EditButtonComponent } from '../../../../shared/components/buttons/edit-button/edit-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { MatDialog } from '@angular/material/dialog';
import { NewModalComponent } from '../../../../core/components/modal/new-modal/new-modal.component';
import { MySearchFieldComponent } from "../../../../shared/components/my-search-field/my-search-field.component";
import { DeleteModalComponent } from '../../../../shared/components/delete-modal/delete-modal.component';
import { ProductService } from '../../product.service';

@Component({
  selector: 'app-product-list',
  imports: [
    ViewButtonComponent,
    EditButtonComponent,
    ShareButtonComponent,
    DeleteButtonComponent,
    MySearchFieldComponent
  ],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.scss',
})
export class ProductListComponent {
  constructor(private productService: ProductService, private matDialog: MatDialog) { }

  new() {
    const newDialog = this.matDialog.open(NewModalComponent);
  }

  delete(id: number, img: string, name: string) {
    const deleteDialog = this.matDialog.open(DeleteModalComponent, { data: { id, img, name }});

    deleteDialog.afterClosed().subscribe((result) => {
      if (result) {
        this.productService.delete(id).subscribe({
          next: () => {
            console.log('product deleted');
          }
        })
      }
    })
  }

  products = [
    {
      id: 1,
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
      name: 'Chicken Pizza',
      price: '$25',
      discountPrice: '',
      discount: '',
      ingredients: [
        {
          name: 'Chicken',
          quantity: '0.3',
          measure: 'kg',
        },
        {
          name: 'Cheese',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
      ],
    },
    {
      id: 2,
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
      name: 'Chicken Pizza',
      price: '$ 25',
      discountPrice: '',
      discount: '',
      ingredients: [
        {
          name: 'Chicken',
          quantity: '0.3',
          measure: 'kg',
        },
        {
          name: 'Cheese',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
      ],
    },
    {
      id: 3,
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
      name: 'Chicken Pizza',
      price: '$ 25',
      discountPrice: '',
      discount: '',
      ingredients: [
        {
          name: 'Chicken',
          quantity: '0.3',
          measure: 'kg',
        },
        {
          name: 'Cheese',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
      ],
    },
    {
      id: 4,
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
      name: 'Chicken Pizza',
      price: '$ 25',
      discountPrice: '',
      discount: '',
      ingredients: [
        {
          name: 'Chicken',
          quantity: '0.3',
          measure: 'kg',
        },
        {
          name: 'Cheese',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
      ],
    },
    {
      id: 5,
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
      name: 'Chicken Pizza',
      price: '$ 25',
      discountPrice: '',
      discount: '',
      ingredients: [
        {
          name: 'Chicken',
          quantity: '0.3',
          measure: 'kg',
        },
        {
          name: 'Cheese',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
      ],
    },
    {
      id: 6,
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
      name: 'Chicken Pizza',
      price: '$ 25',
      discountPrice: '',
      discount: '',
      ingredients: [
        {
          name: 'Chicken',
          quantity: '0.3',
          measure: 'kg',
        },
        {
          name: 'Cheese',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
      ],
    },
    {
      id: 7,
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
      name: 'Chicken Pizza',
      price: '$ 25',
      discountPrice: '',
      discount: '',
      ingredients: [
        {
          name: 'Chicken',
          quantity: '0.3',
          measure: 'kg',
        },
        {
          name: 'Cheese',
          quantity: '0.5',
          measure: 'kg',
        },
        {
          name: 'dough',
          quantity: '0.5',
          measure: 'kg',
        },
      ],
    },
  ];
}
