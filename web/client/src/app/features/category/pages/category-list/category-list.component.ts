import { Component } from '@angular/core';
import { CategoryService } from '../../category.service';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { InfoButtonComponent } from '../../../../shared/components/buttons/info-button/info-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { MySearchFieldComponent } from '../../../../shared/components/my-search-field/my-search-field.component';
import { CreateButtonComponent } from "../../../../shared/components/buttons/create-button/create-button.component";

@Component({
  selector: 'app-category-list',
  imports: [
    ViewButtonComponent,
    InfoButtonComponent,
    ShareButtonComponent,
    DeleteButtonComponent,
    MySearchFieldComponent,
    CreateButtonComponent
],
  templateUrl: './category-list.component.html',
  styleUrl: './category-list.component.scss',
})
export class CategoryListComponent {
  constructor(private categoryService: CategoryService) {}

  ngOnInit(): void {
    this.getAll();
  }

  data: any = [];

  getAll() {
    this.categoryService.getAll().subscribe({
      next: (data: any) => {
        this.data = data;
        console.log(data);
      },
    });
  }

  new() {}

  delete(id: string, name: string, imgUrl: string) {}
}
