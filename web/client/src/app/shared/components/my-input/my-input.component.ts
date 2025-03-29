import { Component, Input } from '@angular/core';
import { CurrencyMaskModule } from 'ng2-currency-mask';

@Component({
  selector: 'app-my-input',
  imports: [CurrencyMaskModule],
  templateUrl: './my-input.component.html',
  styleUrl: './my-input.component.scss',
})
export class MyInputComponent {
  @Input() text = '';
  @Input() type = 'text';
  @Input() isPriceInput: boolean = false;
  @Input() isDiscountInput: boolean = false;
}
