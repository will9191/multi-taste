import { Component } from '@angular/core';
import { ActionButtonComponent } from "../action-button/action-button.component";
import { provideIcons } from '@ng-icons/core';
import { hugeShare05 } from '@ng-icons/huge-icons'

@Component({
  selector: 'app-share-button',
  imports: [ActionButtonComponent],
  viewProviders: [provideIcons({ hugeShare05 })],
  templateUrl: './share-button.component.html',
  styleUrl: './share-button.component.scss'
})
export class ShareButtonComponent {

}
