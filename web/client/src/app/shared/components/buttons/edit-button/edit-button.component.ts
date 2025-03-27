import { Component } from '@angular/core';
import { provideIcons } from '@ng-icons/core';
import { hugeEdit02 } from '@ng-icons/huge-icons'
import { ActionButtonComponent } from "../action-button/action-button.component";

@Component({
  selector: 'app-edit-button',
  imports: [ActionButtonComponent],
  viewProviders: [provideIcons({ hugeEdit02 })],
  templateUrl: './edit-button.component.html',
  styleUrl: './edit-button.component.scss'
})
export class EditButtonComponent {

}
