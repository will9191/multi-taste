import { Component } from '@angular/core';
import { MyInputComponent } from '../../../../shared/components/my-input/my-input.component';
import { CurrencyMaskModule } from 'ng2-currency-mask'
import { CommonModule } from '@angular/common';
import { MatStepper, MatStepperModule } from '@angular/material/stepper';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-product',
  imports: [MyInputComponent, CurrencyMaskModule, CommonModule, MatStepperModule, ReactiveFormsModule, FormsModule],
  templateUrl: './new-product.component.html',
  styleUrl: './new-product.component.scss'
})
export class NewProductComponent {
  productTypes = [
    {
      id: 1,
      name: "Pizza 🍕",
    },
    {
      id: 2,
      name: "Drink 🥤"
    },
  ]

  formGroup: FormGroup;

  constructor(private fb: FormBuilder) {
    this.formGroup = this.fb.group({
      productType: [null, Validators.required],
      name: ['', [Validators.required]],
      price: [0, [Validators.required, Validators.min(0)]],
      discount: [0, [Validators.min(0), Validators.max(100)]],
      discountPrice: [0, Validators.required],
      ingredients: [
        {
          name: '',
          weight: ''
        }
      ],
      volume: [''],
    })
  }

  selectedType: any;

  selectType(type: any, stepper: MatStepper) {
    this.selectedType = type;
    this.formGroup.patchValue({ productType: type.id })
    this.resetSpecificFields();

    console.log(this.formGroup.get(['productType']));

    setTimeout(() => stepper.next(), 200); console.log(this.formGroup.get(['productType']))
  }

  resetSpecificFields() {
    if (this.selectedType.id === 1) {
      this.formGroup.patchValue({
        ingredients: [
          {
            name: '',
            weight: ''
          }
        ],
      })
    } else if (this.selectedType === 2) {
      this.formGroup.patchValue({
        volume: '',
      })
    }
  }
}
