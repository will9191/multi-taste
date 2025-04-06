import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-create-button',
  imports: [],
  templateUrl: './create-button.component.html',
  styleUrl: './create-button.component.scss',
})
export class CreateButtonComponent {
  @Input() text = '';
}
