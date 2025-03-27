import { Component } from '@angular/core';
import { ActionButtonComponent } from "../action-button/action-button.component";
import { provideIcons } from '@ng-icons/core';
import { hugeDelete02 } from '@ng-icons/huge-icons'

@Component({
  selector: 'app-delete-button',
  imports: [ActionButtonComponent],
  viewProviders: [provideIcons({
    hugeDelete02
  })],
  templateUrl: './delete-button.component.html',
  styleUrl: './delete-button.component.scss'
})
export class DeleteButtonComponent {

}
