import { Component } from '@angular/core';
import { ActionButtonComponent } from "../action-button/action-button.component";
import { hugeView } from '@ng-icons/huge-icons'
import { provideIcons } from '@ng-icons/core';

@Component({
  selector: 'app-view-button',
  imports: [ActionButtonComponent],
  viewProviders: [provideIcons({ hugeView })],
  templateUrl: './view-button.component.html',
  styleUrl: './view-button.component.scss'
})
export class ViewButtonComponent {

}
