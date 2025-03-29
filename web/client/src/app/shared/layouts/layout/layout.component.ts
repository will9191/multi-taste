import { Component } from '@angular/core';
import {
  matFoodBankOutline,
  matFeaturedPlayListOutline,
  matDashboardOutline,
  matSettingsOutline,
  matNotificationsNoneOutline,
  matSearchOutline,
  matKeyboardArrowDownOutline,
  matLocalPizzaOutline,
  matPeopleAltOutline,
  matKeyboardArrowUpOutline,
} from '@ng-icons/material-icons/outline';
import { hugeKnife02 } from '@ng-icons/huge-icons';
import { provideIcons } from '@ng-icons/core';

import { SidebarComponent } from '../sidebar/sidebar.component';
import { NavbarComponent } from '../navbar/navbar.component';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { OrderListFixedComponent } from "../../../features/order/order-list-fixed/order-list-fixed.component";

@Component({
  selector: 'app-layout',
  imports: [SidebarComponent, NavbarComponent, RouterModule, OrderListFixedComponent],
  viewProviders: [
    provideIcons({
      matFoodBankOutline,
      matFeaturedPlayListOutline,
      matDashboardOutline,
      matSettingsOutline,
      matSearchOutline,
      matNotificationsNoneOutline,
      matKeyboardArrowDownOutline,
      matLocalPizzaOutline,
      hugeKnife02,
      matPeopleAltOutline,
      matKeyboardArrowUpOutline,
    }),
  ],
  templateUrl: './layout.component.html',
  styleUrl: './layout.component.scss',
})
export class LayoutComponent { }
