import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { NgIcon } from '@ng-icons/core';

@Component({
  selector: 'app-orders',
  imports: [NgIcon, CommonModule],
  templateUrl: './orders.component.html',
  styleUrl: './orders.component.scss',
})
export class OrdersComponent implements OnInit {
  ngOnInit(): void {
    this.orders.map((o) => {
      if (o.status == 'Pending') {
        this.expandedOrders.push(o.id);
      }
    });
  }

  expandedOrders: number[] = [];

  toggleOrderDetails(orderId: number) {
    const index = this.expandedOrders.indexOf(orderId);
    if (index > -1) {
      this.expandedOrders.splice(index, 1);
    } else {
      this.expandedOrders.push(orderId);
    }
  }

  navigation = [
    { name: 'All' },
    { name: 'Pending' },
    { name: 'Done' },
    { name: 'Cancel' },
  ];

  orders = [
    {
      id: 1231,
      user: {
        name: 'Tanya Leon',
      },
      status: 'Done',
      value: 120.0,
      currency: '$',
      orderItems: [
        {
          id: 1,
          name: 'Chicken Pizza',
          img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
          quantity: 2,
          size: 'Big',
        },
      ],
    },
    {
      id: 1232,
      user: {
        name: 'Jeffrey Gordan',
      },
      status: 'Pending',
      value: 100.0,
      currency: '$',
      orderItems: [
        {
          id: 1,
          name: 'Beef Pizza',
          img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSh2M7rqB6_sKiFpXfgp0RkGttpY15ojs1kjw&s',
          quantity: 2,
          size: 'Small',
        },
        {
          id: 1,
          name: 'Chicken Pizza',
          img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuDGCk-3yOOXa-P2hESva-c52_0ca0tyXiSA&s',
          quantity: 1,
          size: 'Big',
        },
      ],
    },
  ];
}
