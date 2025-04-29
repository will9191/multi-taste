import { Component } from '@angular/core';
import { MyInputComponent } from "../../../../shared/components/my-input/my-input.component";
import { FillButtonComponent } from "../../../../shared/components/buttons/fill-button/fill-button.component";

@Component({
  selector: 'app-register',
  imports: [MyInputComponent, FillButtonComponent],
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

}
