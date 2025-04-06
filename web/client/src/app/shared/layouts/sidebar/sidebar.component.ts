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
    { name: 'Dashboard', icon: 'matAnalyticsSharp', to: '' },
    { name: 'Orders', icon: 'matFeaturedPlayListSharp', to: 'orders' },
    { name: 'Products', icon: 'matFastfoodSharp', to: 'products' },
    { name: 'Categories', icon: 'matBallotSharp', to: 'categories' },
    { name: 'Food Bank', icon: 'matFoodBankSharp', to: 'ingredients' },
    { name: "Employee's", icon: 'matBadgeSharp', to: 'employees' },
    //hugeId
  ];
}
