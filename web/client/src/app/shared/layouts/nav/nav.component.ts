import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FillButtonComponent } from "../../components/buttons/fill-button/fill-button.component";

@Component({
  selector: 'app-nav',
  imports: [RouterModule, FillButtonComponent],
  templateUrl: './nav.component.html',
  styleUrl: './nav.component.scss',
})
export class NavComponent {}
