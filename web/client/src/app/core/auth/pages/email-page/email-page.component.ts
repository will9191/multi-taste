import { Component } from '@angular/core';
import { MyInputComponent } from '../../../../shared/components/my-input/my-input.component';
import { RouterModule } from '@angular/router';
import { FillButtonComponent } from "../../../../shared/components/buttons/fill-button/fill-button.component";
import { OutlineButtonComponent } from "../../../../shared/components/buttons/outline-button/outline-button.component";

@Component({
  selector: 'app-email-page',
  imports: [MyInputComponent, RouterModule, FillButtonComponent, OutlineButtonComponent],
  templateUrl: './email-page.component.html',
  styleUrl: './email-page.component.scss',
})
export class EmailPageComponent {}
