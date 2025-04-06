import { Component } from '@angular/core';
import {
  matSettingsOutline,
  matNotificationsNoneOutline,
  matSearchOutline,
  matKeyboardArrowDownOutline,
  matLocalPizzaOutline,
  matPeopleAltOutline,
  matKeyboardArrowUpOutline,
} from '@ng-icons/material-icons/outline';
import {
  matFastfoodSharp,
  matFoodBankSharp,
  matFeaturedPlayListSharp,
  matDashboardSharp,
  matPersonalVideoSharp,
  matAnalyticsSharp,
  matBadgeSharp,matBallotSharp,matSettingsSharp
} from '@ng-icons/material-icons/sharp';
import { hugeKnife02, hugeId } from '@ng-icons/huge-icons';
import { provideIcons } from '@ng-icons/core';

import { SidebarComponent } from '../sidebar/sidebar.component';
import { NavbarComponent } from '../navbar/navbar.component';
import { RouterModule } from '@angular/router';
import { OrderListFixedComponent } from '../../../features/order/order-list-fixed/order-list-fixed.component';

@Component({
  selector: 'app-layout',
  imports: [
    SidebarComponent,
    NavbarComponent,
    RouterModule,
    OrderListFixedComponent,
  ],
  viewProviders: [
    provideIcons({
      matFeaturedPlayListSharp,
      matDashboardSharp,
      matSettingsOutline,
      matSearchOutline,
      matNotificationsNoneOutline,
      matKeyboardArrowDownOutline,
      matLocalPizzaOutline,
      hugeKnife02,
      matPeopleAltOutline,
      matKeyboardArrowUpOutline,
      hugeId,
      matFastfoodSharp,
      matFoodBankSharp,
      matPersonalVideoSharp,
      matAnalyticsSharp,
      matBadgeSharp,matBallotSharp,matSettingsSharp
    }),
  ],
  templateUrl: './layout.component.html',
  styleUrl: './layout.component.scss',
})
export class LayoutComponent {}
