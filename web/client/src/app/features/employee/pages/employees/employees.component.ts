import { Component } from '@angular/core';
import { MySearchFieldComponent } from "../../../../shared/components/my-search-field/my-search-field.component";

@Component({
  selector: 'app-employees',
  imports: [MySearchFieldComponent],
  templateUrl: './employees.component.html',
  styleUrl: './employees.component.scss'
})
export class EmployeesComponent {

}
