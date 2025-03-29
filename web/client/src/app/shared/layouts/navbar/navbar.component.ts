import { Component } from '@angular/core';
import { NgIcon } from '@ng-icons/core';
import { MySearchFieldComponent } from "../../components/my-search-field/my-search-field.component";

@Component({
  selector: 'app-navbar',
  imports: [NgIcon, MySearchFieldComponent],
  viewProviders: [],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.scss'
})
export class NavbarComponent {

}
