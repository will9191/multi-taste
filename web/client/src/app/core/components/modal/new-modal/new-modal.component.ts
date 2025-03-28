import { Component } from '@angular/core';
import { MyInputComponent } from "../../../../shared/components/my-input/my-input.component";

@Component({
  selector: 'app-new-modal',
  imports: [MyInputComponent],
  templateUrl: './new-modal.component.html',
  styleUrl: './new-modal.component.scss'
})
export class NewModalComponent {

}
