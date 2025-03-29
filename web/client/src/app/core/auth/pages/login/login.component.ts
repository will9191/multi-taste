import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { MyInputComponent } from "../../../../shared/components/my-input/my-input.component";
import { NgIcon, provideIcons } from '@ng-icons/core';
import { hugeSquareArrowRight02, hugeUser } from '@ng-icons/huge-icons'

@Component({
  selector: 'app-login',
  imports: [RouterModule, MyInputComponent, NgIcon],
  viewProviders: [provideIcons({ hugeSquareArrowRight02, hugeUser })],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss',
})
export class LoginComponent {
  users = [
    {
      img: 'will.jpeg',
      role: 'Owner',
      credentials: {
        email: 'willian.fernando040@gmail.com',
        password: 'admin'
      }
    },
    {
      role: 'Employee',
      credentials: {
        email: 'employee@gmail.com',
        password: 'password'
      }
    }
  ]
}
