import { Component } from '@angular/core';
import { ActionButtonComponent } from "../buttons/action-button/action-button.component";
import { EditButtonComponent } from "../buttons/edit-button/edit-button.component";
import { ViewButtonComponent } from "../buttons/view-button/view-button.component";
import { DeleteButtonComponent } from "../buttons/delete-button/delete-button.component";
import { ShareButtonComponent } from "../buttons/share-button/share-button.component";

@Component({
  selector: 'app-ingredients',
  imports: [ActionButtonComponent, EditButtonComponent, ViewButtonComponent, DeleteButtonComponent, ShareButtonComponent],
  templateUrl: './ingredients.component.html',
  styleUrl: './ingredients.component.scss'
})
export class IngredientsComponent {
  ingredients = [
    {
      img: "https://www.seriouseats.com/thmb/xw1krLC9Yh85qx1wl5jw0BPCWHk=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__serious_eats__seriouseats.com__2015__07__20210324-SouthernFriedChicken-Andrew-Janjigian-21-cea1fe39234844638018b15259cabdc2.jpg",
      name: "Chicken",
      quantity: 25,
      measure: 'kg'
    }
  ]
}
