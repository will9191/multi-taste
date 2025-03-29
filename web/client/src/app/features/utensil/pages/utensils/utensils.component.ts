import { Component } from '@angular/core';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { EditButtonComponent } from '../../../../shared/components/buttons/edit-button/edit-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { MySearchFieldComponent } from "../../../../shared/components/my-search-field/my-search-field.component";

@Component({
  selector: 'app-utensils',
  imports: [
    ViewButtonComponent,
    EditButtonComponent,
    ShareButtonComponent,
    DeleteButtonComponent,
    MySearchFieldComponent
],
  templateUrl: './utensils.component.html',
  styleUrl: './utensils.component.scss',
})
export class UtensilsComponent {
  utensils = [
    {
      img: 'https://imgs.search.brave.com/NXT_4ti184QKN26Y52R4LTJBE3f4QkBi6ZW_bvwgMvA/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5nZXR0eWltYWdl/cy5jb20vaWQvOTIz/NjY4MDcvcGhvdG8v/YS1mb3VyLWZpbmdl/cmVkLXN0YWlubGVz/cy1zdGVlbC1mb3Jr/LW1hZGUtaW4tc2hl/ZmZpZWxkLmpwZz9z/PTYxMng2MTImdz0w/Jms9MjAmYz1wZ0x1/YTVIWV82V3J3X3ZY/UF80cE1XUE5qZlZx/cDlHUWVOY3NKMmNK/ZTQ4PQ',
      name: 'Fork',
      quantity: 150,
    },
  ];
}
