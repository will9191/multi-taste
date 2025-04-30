import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FillButtonComponent } from "../../components/buttons/fill-button/fill-button.component";
import { StoreSelectionComponent } from "../../components/store-selection/store-selection.component";
import { BagComponent } from "../../components/bag/bag.component";

@Component({
  selector: 'app-nav',
  imports: [RouterModule, FillButtonComponent, StoreSelectionComponent, BagComponent],
  templateUrl: './nav.component.html',
  styleUrl: './nav.component.scss',
})
export class NavComponent {}
