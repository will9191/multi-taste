import { CommonModule, DatePipe } from '@angular/common';
import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { NgIcon, provideIcons } from '@ng-icons/core';
import { hugeEdit02 } from '@ng-icons/huge-icons';

@Component({
  selector: 'app-product-details',
  imports: [DatePipe, NgIcon, CommonModule],
  viewProviders: [
    provideIcons({
      hugeEdit02,
    }),
  ],
  templateUrl: './product-details.component.html',
  styleUrl: './product-details.component.scss',
})
export class ProductDetailsComponent {
  constructor(@Inject(MAT_DIALOG_DATA) public product: any) {}

  changed: boolean = false;
}
