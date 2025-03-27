import { Routes } from '@angular/router';
import { LoginComponent } from './core/auth/pages/login/login.component';
import { LayoutComponent } from './shared/layouts/layout/layout.component';
import { ProductListComponent } from './features/product/pages/product-list/product-list.component';
import { IngredientListComponent } from './features/ingredient/pages/ingredient-list/ingredient-list.component';
import { UtensilsComponent } from './features/utensil/pages/utensils/utensils.component';
import { EmployeesComponent } from './features/employee/pages/employees/employees.component';
import { RegisterComponent } from './core/auth/pages/register/register.component';

export const routes: Routes = [
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: 'products',
        component: ProductListComponent,
        title: 'Products - W Pizza',
      },
      {
        path: 'ingredients',
        component: IngredientListComponent,
        title: 'Ingredients - W Pizza',
      },
      {
        path: 'utensils',
        component: UtensilsComponent,
        title: 'Utensils - W Pizza',
      },
      {
        path: 'employees',
        component: EmployeesComponent,
        title: 'Employees - W Pizza',
      },
    ],
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'register',
    component: RegisterComponent,
  },
];
