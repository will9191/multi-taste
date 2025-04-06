import { Component, OnInit } from '@angular/core';
import { ActionButtonComponent } from '../../../../shared/components/buttons/action-button/action-button.component';
import { EditButtonComponent } from '../../../../shared/components/buttons/edit-button/edit-button.component';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { MySearchFieldComponent } from '../../../../shared/components/my-search-field/my-search-field.component';
import { IngredientService } from '../../ingredient.service';
import { CreateButtonComponent } from '../../../../shared/components/buttons/create-button/create-button.component';

@Component({
  selector: 'app-ingredient-list',
  imports: [
    ActionButtonComponent,
    EditButtonComponent,
    ViewButtonComponent,
    DeleteButtonComponent,
    ShareButtonComponent,
    MySearchFieldComponent,
    CreateButtonComponent
],
  templateUrl: './ingredient-list.component.html',
  styleUrl: './ingredient-list.component.scss',
})
export class IngredientListComponent implements OnInit {
  constructor(private ingredientService: IngredientService) {}
  ingredients: any = [];

  ngOnInit(): void {
    this.findAll();
  }

  findAll() {
    this.ingredientService.findAll().subscribe({
      next: (data: any) => {
        this.ingredients = data;
      },
    });
  }

  delete() {}
}
