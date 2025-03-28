import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { MyInputComponent } from "../../../../shared/components/my-input/my-input.component";

@Component({
  selector: 'app-login',
  imports: [RouterModule, MyInputComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss',
})
export class LoginComponent {}
