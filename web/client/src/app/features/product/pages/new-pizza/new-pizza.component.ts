import { Component } from '@angular/core';
import { MyInputComponent } from "../../../../shared/components/my-input/my-input.component";

@Component({
  selector: 'app-new-pizza',
  imports: [MyInputComponent],
  templateUrl: './new-pizza.component.html',
  styleUrl: './new-pizza.component.scss'
})
export class NewPizzaComponent {

}
