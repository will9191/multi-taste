import { Component, Input } from '@angular/core';
import { NgIcon, provideIcons } from '@ng-icons/core';
import { matSearchOutline } from '@ng-icons/material-icons/outline'

@Component({
  selector: 'app-my-search-field',
  imports: [NgIcon],
  viewProviders: [provideIcons({
    matSearchOutline
  })],
  templateUrl: './my-search-field.component.html',
  styleUrl: './my-search-field.component.scss'
})
export class MySearchFieldComponent {
  @Input() placeholder = "Search"

}
