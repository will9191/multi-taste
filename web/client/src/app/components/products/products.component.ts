import { Component } from '@angular/core';
import { ViewButtonComponent } from "../buttons/view-button/view-button.component";
import { EditButtonComponent } from "../buttons/edit-button/edit-button.component";
import { ShareButtonComponent } from "../buttons/share-button/share-button.component";
import { DeleteButtonComponent } from "../buttons/delete-button/delete-button.component";

@Component({
  selector: 'app-products',
  imports: [ViewButtonComponent, EditButtonComponent, ShareButtonComponent, DeleteButtonComponent],
  templateUrl: './products.component.html',
  styleUrl: './products.component.scss',
})
export class ProductsComponent {
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
  ];
}
