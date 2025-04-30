import { Component, OnInit } from '@angular/core';
import { ActionButtonComponent } from '../../../../shared/components/buttons/action-button/action-button.component';
import { InfoButtonComponent } from '../../../../shared/components/buttons/info-button/info-button.component';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { MySearchFieldComponent } from '../../../../shared/components/my-search-field/my-search-field.component';
import { CustomizationService } from '../../customization.service';
import { CreateButtonComponent } from '../../../../shared/components/buttons/create-button/create-button.component';
import { MatDialog } from '@angular/material/dialog';
import { NewCustomizationComponent } from '../new-customization/new-customization.component';

@Component({
  selector: 'app-customization-list',
  imports: [
    ActionButtonComponent,
    InfoButtonComponent,
    ViewButtonComponent,
    DeleteButtonComponent,
    ShareButtonComponent,
    MySearchFieldComponent,
    CreateButtonComponent
],
  templateUrl: './customization-list.component.html',
  styleUrl: './customization-list.component.scss',
})
export class CustomizationListComponent implements OnInit {
  constructor(private customizationService: CustomizationService, private matDialog: MatDialog) {}
  customizations: any = [];

  ngOnInit(): void {
    this.findAll();
  }

  findAll() {
    this.customizationService.findAll().subscribe({
      next: (data: any) => {
        this.customizations = data;
      },
    });
  }

  create(){
    const dialog =this.matDialog.open(NewCustomizationComponent);
  }

  delete() {}
}
