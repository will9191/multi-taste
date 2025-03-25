import { Component } from '@angular/core';
import { NgIcon } from '@ng-icons/core';

@Component({
  selector: 'app-sidebar',
  imports: [NgIcon],
  templateUrl: './sidebar.component.html',
  styleUrl: './sidebar.component.scss',
})
export class SidebarComponent {
  sideItems = [
    { name: 'Dashboard', icon: 'matDashboardOutline', to: '' },
    { name: 'Orders', icon: 'matFeaturedPlayListOutline', to: '' },
    { name: 'Food Bank', icon: 'matFoodBankOutline', to: '' },
  ];
}
