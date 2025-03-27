import { Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { LayoutComponent } from './components/layout/layout.component';
import { ProductsComponent } from './components/products/products.component';
import { IngredientsComponent } from './components/ingredients/ingredients.component';
import { UtensilsComponent } from './components/utensils/utensils.component';
import { EmployeesComponent } from './components/employees/employees.component';

export const routes: Routes = [
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: 'products',
        component: ProductsComponent,
        title: 'Products - W Pizza'
      },
      {
        path: 'ingredients',
        component: IngredientsComponent,
        title: 'Ingredients - W Pizza'
      },
      {
        path: 'utensils',
        component: UtensilsComponent,
        title: 'Utensils - W Pizza'
      },
      {
        path: 'employees',
        component: EmployeesComponent,
        title: 'Employees - W Pizza'
      }
    ],
  },
  {
    path: 'login',
    component: LoginComponent,
  },
];
