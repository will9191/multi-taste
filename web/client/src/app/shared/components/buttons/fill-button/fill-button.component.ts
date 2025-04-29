import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-fill-button',
  imports: [],
  templateUrl: './fill-button.component.html',
  styleUrl: './fill-button.component.scss'
})
export class FillButtonComponent {
  @Input() text = "";
  loading: boolean = false;
}
