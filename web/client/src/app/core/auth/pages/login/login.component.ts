import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { MyInputComponent } from '../../../../shared/components/my-input/my-input.component';
import { NgIcon, provideIcons } from '@ng-icons/core';
import {
  hugeSquareArrowRight02,
  hugeUser,
  hugeMail01,
} from '@ng-icons/huge-icons';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatStepperModule } from '@angular/material/stepper';
import { FillButtonComponent } from "../../../../shared/components/buttons/fill-button/fill-button.component";

@Component({
  selector: 'app-login',
  imports: [RouterModule, MyInputComponent, NgIcon, MatStepperModule, FillButtonComponent],
  viewProviders: [
    provideIcons({ hugeSquareArrowRight02, hugeUser, hugeMail01 }),
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss',
})
export class LoginComponent {
  formGroup: FormGroup;

  constructor(private fb: FormBuilder) {
    this.formGroup = this.fb.group({
      productType: [null, Validators.required],
      name: ['', [Validators.required]],
      price: [0, [Validators.required, Validators.min(0)]],
      discount: [0, [Validators.min(0), Validators.max(100)]],
      discountPrice: [0, Validators.required],
      ingredients: this.fb.array([]),
      volume: [''],
    });
  }

 
}
