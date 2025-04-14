import { Component } from '@angular/core';
import { provideIcons } from '@ng-icons/core';
import { hugeInformationCircle } from '@ng-icons/huge-icons';
import { ActionButtonComponent } from '../action-button/action-button.component';

@Component({
  selector: 'app-info-button',
  imports: [ActionButtonComponent],
  viewProviders: [provideIcons({ hugeInformationCircle })],
  templateUrl: './info-button.component.html',
  styleUrl: './info-button.component.scss',
})
export class InfoButtonComponent {}
