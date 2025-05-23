import { Component } from '@angular/core';
import { MyInputComponent } from "../../../../shared/components/my-input/my-input.component";
import { FillButtonComponent } from "../../../../shared/components/buttons/fill-button/fill-button.component";

@Component({
  selector: 'app-forgot-password',
  imports: [MyInputComponent, FillButtonComponent],
  templateUrl: './forgot-password.component.html',
  styleUrl: './forgot-password.component.scss'
})
export class ForgotPasswordComponent {

}
