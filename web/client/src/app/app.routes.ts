import { Routes } from '@angular/router';
import { LoginComponent } from './core/auth/pages/login/login.component';
import { LayoutComponent } from './shared/layouts/layout/layout.component';
import { ProductListComponent } from './features/product/pages/product-list/product-list.component';
import { CustomizationListComponent } from './features/customization/pages/customization-list/customization-list.component';
import { EmployeeListComponent } from './features/employee/pages/employee-list/employee-list.component';
import { RegisterComponent } from './core/auth/pages/register/register.component';
import { ProductDetailsComponent } from './features/product/pages/product-details/product-details.component';
import { OrderListComponent } from './features/order/order-list/order-list.component';
import { OrderDetailsComponent } from './features/order/order-details/order-details.component';
import { AuthPageComponent } from './core/auth/pages/auth-page/auth-page.component';
import { EmailPageComponent } from './core/auth/pages/email-page/email-page.component';
import { NavComponent } from './shared/layouts/nav/nav.component';
import { CategoryListComponent } from './features/category/pages/category-list/category-list.component';
import { ComboListComponent } from './features/combo/pages/combo-list/combo-list.component';

export const routes: Routes = [
  {
    path: '',
    component: NavComponent,
    children: [],
  },
  {
    path: 'dash',
    component: LayoutComponent,
    children: [
      {
        path: 'products',
        component: ProductListComponent,
        title: 'Products',
      },
      {
        path: 'combos',
        component: ComboListComponent,
        title: 'Combos',
      },
      {
        path: 'categories',
        component: CategoryListComponent,
      },
      {
        path: 'orders',
        component: OrderListComponent,
        title: 'Orders',
      },
      {
        path: 'orders/1',
        component: OrderDetailsComponent,
      },
      {
        path: 'customizations',
        component: CustomizationListComponent,
        title: 'Customizations',
      },

      {
        path: 'employees',
        component: EmployeeListComponent,
        title: 'Employees',
      },
    ],
  },
  {
    path: 'auth',
    component: AuthPageComponent,
  },
  { path: 'login', component: LoginComponent },
  {
    path: 'email-selected',
    component: EmailPageComponent,
  },
  {
    path: 'register',
    component: RegisterComponent,
  },
];
