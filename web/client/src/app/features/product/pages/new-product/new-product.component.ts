import { Component, OnInit } from '@angular/core';
import { MyInputComponent } from '../../../../shared/components/my-input/my-input.component';
import { CurrencyMaskModule } from 'ng2-currency-mask';
import { CommonModule } from '@angular/common';
import { MatStepper } from '@angular/material/stepper';
import {
  FormArray,
  FormBuilder,
  FormGroup,
  FormsModule,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { CategoryService } from '../../../category/category.service';
import { CustomizationService } from '../../../customization/customization.service';
import { NgIcon, provideIcons } from '@ng-icons/core';
import {
  matKeyboardArrowDownSharp,
  matKeyboardArrowUpSharp,
  matCloseSharp,
  matCheckSharp,
  matCachedSharp,
  matMinusSharp,
} from '@ng-icons/material-icons/sharp';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-new-product',
  imports: [
    CurrencyMaskModule,
    CommonModule,
    ReactiveFormsModule,
    FormsModule,
    NgIcon,
  ],
  viewProviders: [
    provideIcons({
      matKeyboardArrowDownSharp,
      matKeyboardArrowUpSharp,
      matCloseSharp,
      matCheckSharp,
      matCachedSharp,
      matMinusSharp,
    }),
  ],
  templateUrl: './new-product.component.html',
  styleUrl: './new-product.component.scss',
})
export class NewProductComponent implements OnInit {
  formGroup: FormGroup;
  changed = false;

  constructor(
    private fb: FormBuilder,
    private categoryService: CategoryService,
    private customizationService: CustomizationService,
    private ref: MatDialogRef<NewProductComponent>
  ) {
    this.formGroup = this.fb.group({
      categoryId: [null, Validators.required],
      name: ['', [Validators.required]],
      description: ['', [Validators.required]],
      price: [null, [Validators.required, Validators.min(0)]],
      discount: [null, [Validators.min(0), Validators.max(100)]],
      customizations: this.fb.array([]),
    });
  }

  close() {
    this.ref.close();
  }

  ngOnInit(): void {
    this.getCategories();
    this.getCustomizations();
  }

  selectedType: any;

  selectType(type: any, stepper: MatStepper) {
    this.selectedType = type;
    this.formGroup.patchValue({ categoryId: type.id });
    this.resetSpecificFields();

    setTimeout(() => stepper.next(), 200);
  }

  resetSpecificFields() {
    if (this.selectedType.id === 1) {
      this.formGroup.setControl('customizations', this.fb.array([]));
    } else if (this.selectedType === 2) {
      this.formGroup.patchValue({
        volume: '',
      });
    }
  }

  add() {
    console.log(this.formGroup.get(['customizations']));
  }

  categories: any;

  getCategories() {
    this.categoryService.getAll().subscribe({
      next: (data: any) => {
        this.categories = data;
      },
    });
  }

  customizations: any;

  getCustomizations() {
    this.customizationService.findAll().subscribe({
      next: (data: any) => {
        this.customizations = data;
      },
    });
  }

  get customizationsArray(): FormArray {
    return this.formGroup.get('customizations') as FormArray;
  }

  customizationsFormArray(): FormArray {
    return this.formGroup.get('customizations') as FormArray;
  }

  addToCustomizations(customization: any) {
    this.customizationsFormArray().push(
      this.fb.group({
        id: [customization.id, Validators.required],
        name: [customization.name, Validators.required],
        imgUrl: [customization.imgUrl, Validators.required],
        includedByDefault: [true, Validators.required],
        quantityAdjustable: [true, Validators.required],
        quantity: [0, [Validators.required, Validators.min(1)]],
        additionalQuantity: [true, [Validators.required]],
        additionalPrice: [0, [Validators.required]],
        minQuantity: [0, Validators.required],
        maxQuantity: [0, Validators.required],
      })
    );
  }

  removeToCustomizations(index: number) {
    this.customizationsFormArray().removeAt(index);
  }

  isUsed(customization: any): boolean {
    return this.customizationsFormArray().controls?.some(
      (cntrl) => cntrl.value.id === customization.id
    );
  }

  includedStatus(index: number): boolean {
    return this.customizationsFormArray()?.at(index).get('includedByDefault')
      ?.value;
  }

  setIncluded(index: number) {
    const control = this.customizationsFormArray().at(index) as FormGroup;
    const currentValue = control.get('includedByDefault')?.value;
    control.get('includedByDefault')?.setValue(!currentValue);
  }

  adjustableStatus(index: number): boolean {
    return this.customizationsFormArray()?.at(index).get('quantityAdjustable')
      ?.value;
  }

  setQuantityAdjustable(index: number) {
    const control = this.customizationsFormArray().at(index) as FormGroup;
    const currentValue = control.get('quantityAdjustable')?.value;
    control.get('quantityAdjustable')?.setValue(!currentValue);
  }

  isCustomizablesOpen: boolean = false;

  setCustomizationOpen() {
    this.isCustomizablesOpen = !this.isCustomizablesOpen;
  }
}
