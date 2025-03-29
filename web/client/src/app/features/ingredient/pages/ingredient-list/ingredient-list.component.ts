import { Component } from '@angular/core';
import { ActionButtonComponent } from '../../../../shared/components/buttons/action-button/action-button.component';
import { EditButtonComponent } from '../../../../shared/components/buttons/edit-button/edit-button.component';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { MySearchFieldComponent } from "../../../../shared/components/my-search-field/my-search-field.component";

@Component({
  selector: 'app-ingredient-list',
  imports: [
    ActionButtonComponent,
    EditButtonComponent,
    ViewButtonComponent,
    DeleteButtonComponent,
    ShareButtonComponent,
    MySearchFieldComponent
],
  templateUrl: './ingredient-list.component.html',
  styleUrl: './ingredient-list.component.scss',
})
export class IngredientListComponent {

  delete() {
    
  }

  ingredients = [
    {
      img: 'https://www.seriouseats.com/thmb/xw1krLC9Yh85qx1wl5jw0BPCWHk=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__serious_eats__seriouseats.com__2015__07__20210324-SouthernFriedChicken-Andrew-Janjigian-21-cea1fe39234844638018b15259cabdc2.jpg',
      name: 'Chicken',
      quantity: 25,
      measure: 'kg',
    },
  ];
}
