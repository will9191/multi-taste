import { Component } from '@angular/core';
import { MySearchFieldComponent } from "../../../../shared/components/my-search-field/my-search-field.component";
import { CreateButtonComponent } from "../../../../shared/components/buttons/create-button/create-button.component";

@Component({
  selector: 'app-employee-list',
  imports: [MySearchFieldComponent, CreateButtonComponent],
  templateUrl: './employee-list.component.html',
  styleUrl: './employee-list.component.scss'
})
export class EmployeeListComponent {

}
