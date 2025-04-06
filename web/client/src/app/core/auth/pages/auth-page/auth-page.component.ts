import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { MyInputComponent } from '../../../../shared/components/my-input/my-input.component';
import { NgIcon, provideIcons } from '@ng-icons/core';
import { MatStepperModule } from '@angular/material/stepper';
import {
  hugeMail01,
  hugeSquareArrowRight02,
  hugeUser,
} from '@ng-icons/huge-icons';

@Component({
  selector: 'app-auth-page',
  imports: [RouterModule, MyInputComponent, NgIcon, MatStepperModule],
  viewProviders: [
    provideIcons({ hugeSquareArrowRight02, hugeUser, hugeMail01 }),
  ],
  templateUrl: './auth-page.component.html',
  styleUrl: './auth-page.component.scss',
})
export class AuthPageComponent {
  users = [
    {
      img: 'will.jpeg',
      role: 'Owner',
      continue: 'Continue as',
      credentials: {
        email: 'willian.fernando040@gmail.com',
        password: 'admin',
      },
    },
    {
      icon: 'hugeUser',
      role: 'Employee',
      continue: 'Continue as',
      credentials: {
        email: 'employee@gmail.com',
        password: 'password',
      },
    },
    {
      icon: 'hugeUser',
      role: 'Customer',
      continue: 'Continue as',
      credentials: {
        email: 'customer@gmail.com',
        password: 'password',
      },
    },
    {
      icon: 'hugeMail01',
      role: 'Email',
      continue: 'Continue with',
      to: '/email-selected',
    },
  ];
}
