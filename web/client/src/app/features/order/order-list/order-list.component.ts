import { Component } from '@angular/core';

@Component({
  selector: 'app-order-list',
  imports: [],
  templateUrl: './order-list.component.html',
  styleUrl: './order-list.component.scss'
})
export class OrderListComponent {
  orders = [
    {
      id: 1,
      user: {
        firstName: "Tanya",
        
      }
    }
  ]

}
