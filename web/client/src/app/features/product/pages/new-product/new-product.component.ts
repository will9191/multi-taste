import { Component } from '@angular/core';
import { MyInputComponent } from '../../../../shared/components/my-input/my-input.component';
import { CurrencyMaskModule } from 'ng2-currency-mask';
import { CommonModule } from '@angular/common';
import { MatStepper, MatStepperModule } from '@angular/material/stepper';
import {
  FormArray,
  FormBuilder,
  FormGroup,
  FormsModule,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-new-product',
  imports: [
    MyInputComponent,
    CurrencyMaskModule,
    CommonModule,
    MatStepperModule,
    ReactiveFormsModule,
    FormsModule,
  ],
  templateUrl: './new-product.component.html',
  styleUrl: './new-product.component.scss',
})
export class NewProductComponent {
  productTypes = [
    {
      id: 1,
      name: 'Pizza 🍕',
    },
    {
      id: 2,
      name: 'Drink 🥤',
    },
  ];

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

  selectedType: any;

  selectType(type: any, stepper: MatStepper) {
    this.selectedType = type;
    this.formGroup.patchValue({ productType: type.id });
    this.resetSpecificFields();

    setTimeout(() => stepper.next(), 200);
  }

  resetSpecificFields() {
    if (this.selectedType.id === 1) {
      this.formGroup.setControl('ingredients', this.fb.array([]));
    } else if (this.selectedType === 2) {
      this.formGroup.patchValue({
        volume: '',
      });
    }
  }

  add() {
    console.log(this.formGroup.get(['ingredients']));
  }

  ingredientsList = [
    {
      id: 1,
      name: 'Chicken',
      quantity: 0,
    },
    {
      id: 2,
      name: 'Tomato',
      quantity: 0,
    },
    {
      id: 3,
      name: 'Cheese',
      quantity: 0,
    },
    {
      id: 4,
      name: 'Chicken',
      quantity: 0,
    },
    {
      id: 5,
      name: 'Tomato',
      quantity: 0,
    },
    {
      id: 6,
      name: 'Cheese',
      quantity: 0,
    },
    {
      id: 7,
      name: 'Chicken',
      quantity: 0,
    },
    {
      id: 8,
      name: 'Tomato',
      quantity: 0,
    },
    {
      id: 9,
      name: 'Cheese',
      quantity: 0,
    },
  ];

  ingredientsFormArray(): FormArray {
    return this.formGroup.get('ingredients') as FormArray;
  }

  addToIngredients(ingredient: any) {
    this.ingredientsFormArray().push(
      this.fb.group({
        id: [ingredient.id, Validators.required],
        name: [ingredient.name, Validators.required],
        weight: [0, [Validators.required, Validators.min(1)]],
      })
    );
  }

  removeToIngredients(index: number) {
    this.ingredientsFormArray().removeAt(index);
  }

  isUsed(ingredient: any): boolean {
    return this.ingredientsFormArray().controls?.some(
      (cntrl) => cntrl.value.id === ingredient.id
    );
  }
}
