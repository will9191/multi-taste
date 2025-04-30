import { Component, Input } from '@angular/core';
import { NgIcon, provideIcons } from '@ng-icons/core';
import { featherShoppingBag } from '@ng-icons/feather-icons'

@Component({
  selector: 'app-bag',
  imports: [NgIcon],
  viewProviders: provideIcons({ featherShoppingBag }),
  templateUrl: './bag.component.html',
  styleUrl: './bag.component.scss'
})
export class BagComponent {
  @Input() value = 0.00;
}
