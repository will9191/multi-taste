import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-my-input',
  imports: [],
  templateUrl: './my-input.component.html',
  styleUrl: './my-input.component.scss',
})
export class MyInputComponent {
  @Input() text = '';
  @Input() type = 'text';
}
