import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-store-selection',
  imports: [],
  templateUrl: './store-selection.component.html',
  styleUrl: './store-selection.component.scss'
})
export class StoreSelectionComponent {
  @Input() mode = "Dive In";
}
