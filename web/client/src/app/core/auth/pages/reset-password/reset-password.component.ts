import { Component } from '@angular/core';
import { MyInputComponent } from "../../../../shared/components/my-input/my-input.component";
import { FillButtonComponent } from "../../../../shared/components/buttons/fill-button/fill-button.component";

@Component({
  selector: 'app-reset-password',
  imports: [MyInputComponent, FillButtonComponent],
  templateUrl: './reset-password.component.html',
  styleUrl: './reset-password.component.scss'
})
export class ResetPasswordComponent {

}
