import { Component } from '@angular/core';
import { MyInputComponent } from '../../../../shared/components/my-input/my-input.component';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-email-page',
  imports: [MyInputComponent, RouterModule],
  templateUrl: './email-page.component.html',
  styleUrl: './email-page.component.scss',
})
export class EmailPageComponent {}
