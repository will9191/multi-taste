import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { NgIcon } from '@ng-icons/core';

@Component({
  selector: 'app-new-customization',
  imports: [NgIcon, ReactiveFormsModule, CommonModule],
  templateUrl: './new-customization.component.html',
  styleUrl: './new-customization.component.scss'
})
export class NewCustomizationComponent {
  constructor(private dialog: MatDialogRef<NewCustomizationComponent>){}

  formGroup:any;

  changed: boolean = false;

  close(){
    this.dialog.close();
  }
}
