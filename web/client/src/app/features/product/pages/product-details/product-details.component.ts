import { Component } from '@angular/core';

@Component({
  selector: 'app-product-details',
  imports: [],
  templateUrl: './product-details.component.html',
  styleUrl: './product-details.component.scss'
})
export class ProductDetailsComponent {
  product = {
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
      }],
  }
}
