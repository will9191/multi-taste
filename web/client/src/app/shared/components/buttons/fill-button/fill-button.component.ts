import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-fill-button',
  imports: [CommonModule],
  templateUrl: './fill-button.component.html',
  styleUrl: './fill-button.component.scss'
})
export class FillButtonComponent {
  @Input() text = "";
  @Input() loading: boolean = false;
  @Input() active: boolean = true;
}
