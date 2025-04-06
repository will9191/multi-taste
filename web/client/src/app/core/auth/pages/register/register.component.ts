import { Component } from '@angular/core';
import { MyInputComponent } from "../../../../shared/components/my-input/my-input.component";

@Component({
  selector: 'app-register',
  imports: [MyInputComponent],
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

}
