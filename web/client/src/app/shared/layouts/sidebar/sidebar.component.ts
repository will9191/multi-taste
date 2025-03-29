import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { NgIcon } from '@ng-icons/core';

@Component({
  selector: 'app-sidebar',
  imports: [NgIcon, RouterModule],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.scss',
})
export class SidebarComponent {
  sideItems = [
    { name: 'Dashboard', icon: 'matDashboardOutline', to: '' },
    { name: 'Orders', icon: 'matFeaturedPlayListOutline', to: 'orders' },
    { name: 'Products', icon: 'matLocalPizzaOutline', to: 'products' },
    { name: 'Food Bank', icon: 'matFoodBankOutline', to: 'ingredients' },
    { name: 'Utensils', icon: 'hugeKnife02', to: 'utensils' },
    { name: "Employee's", icon: 'matPeopleAltOutline', to: 'employees' },
  ];
}
