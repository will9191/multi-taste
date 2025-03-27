import { Component } from '@angular/core';
import {
  matFoodBankOutline,
  matFeaturedPlayListOutline,
  matDashboardOutline,
  matSettingsOutline,
  matNotificationsNoneOutline,
  matSearchOutline,
  matKeyboardArrowDownOutline, matLocalPizzaOutline, matPeopleAltOutline
} from '@ng-icons/material-icons/outline';
import { hugeKnife02 } from '@ng-icons/huge-icons'
import { provideIcons } from '@ng-icons/core';
import { OrdersComponent } from '../orders/orders.component';
import { SidebarComponent } from '../sidebar/sidebar.component';
import { NavbarComponent } from '../navbar/navbar.component';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-layout',
  imports: [OrdersComponent, SidebarComponent, NavbarComponent, RouterModule],
  viewProviders: [
    provideIcons({
      matFoodBankOutline,
      matFeaturedPlayListOutline,
      matDashboardOutline,
      matSettingsOutline,
      matSearchOutline,
      matNotificationsNoneOutline,
      matKeyboardArrowDownOutline, matLocalPizzaOutline, hugeKnife02, matPeopleAltOutline
    }),
  ],
  templateUrl: './layout.component.html',
  styleUrl: './layout.component.scss',
})
export class LayoutComponent { }
