import { Component } from '@angular/core';
import { NgIcon } from '@ng-icons/core';

@Component({
  selector: 'app-orders',
  imports: [NgIcon],
  templateUrl: './orders.component.html',
  styleUrl: './orders.component.scss',
})
export class OrdersComponent {
  navigation = [
    { name: 'All' },
    { name: 'Pending' },
    { name: 'Done' },
    { name: 'Cancel' },
  ];

  
}
