import { Component } from '@angular/core';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { EditButtonComponent } from '../../../../shared/components/buttons/edit-button/edit-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { MatDialog } from '@angular/material/dialog';
import { NewModalComponent } from '../../../../core/components/modal/new-modal/new-modal.component';

@Component({
  selector: 'app-product-list',
  imports: [
    ViewButtonComponent,
    EditButtonComponent,
    ShareButtonComponent,
    DeleteButtonComponent,
  ],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.scss',
})
export class ProductListComponent {
  constructor(private matDialog: MatDialog) {}

  new() {
    const newDialog = this.matDialog.open(NewModalComponent);
  }

  products = [
    {
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
