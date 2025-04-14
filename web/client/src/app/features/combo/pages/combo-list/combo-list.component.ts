import { Component } from '@angular/core';
import { ComboService } from '../../combo.service';
import { MatDialog } from '@angular/material/dialog';
import { NewComboComponent } from '../new-combo/new-combo.component';
import { DeleteModalComponent } from '../../../../shared/components/delete-modal/delete-modal.component';
import { ComboDetailsComponent } from '../combo-details/combo-details.component';
import { ViewButtonComponent } from '../../../../shared/components/buttons/view-button/view-button.component';
import { InfoButtonComponent } from '../../../../shared/components/buttons/info-button/info-button.component';
import { ShareButtonComponent } from '../../../../shared/components/buttons/share-button/share-button.component';
import { DeleteButtonComponent } from '../../../../shared/components/buttons/delete-button/delete-button.component';
import { CreateButtonComponent } from '../../../../shared/components/buttons/create-button/create-button.component';
import { MySearchFieldComponent } from '../../../../shared/components/my-search-field/my-search-field.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-combo-list',
  imports: [
    CommonModule,
    ViewButtonComponent,
    InfoButtonComponent,
    ShareButtonComponent,
    DeleteButtonComponent,
    CreateButtonComponent,
    MySearchFieldComponent,
  ],
  templateUrl: './combo-list.component.html',
  styleUrl: './combo-list.component.scss',
})
export class ComboListComponent {
  constructor(
    private comboService: ComboService,
    private matDialog: MatDialog
  ) {}

  combos: any = [];

  ngOnInit(): void {
    this.comboService.findAll().subscribe({
      next: (data: any) => {
        this.combos = data;
      },
    });
  }

  new() {
    const newDialog = this.matDialog.open(NewComboComponent, {
      minWidth: '60vw',
    });
  }

  delete(id: number, img: string, name: string) {
    const dialog = this.matDialog.open(DeleteModalComponent, {
      data: { id, img, name },
    });

    dialog.afterClosed().subscribe((result) => {
      if (result) {
        this.comboService.delete(id).subscribe({
          next: () => {
            console.log('product deleted');
          },
        });
      }
    });
  }

  seeInfo(product: any) {
    const dialog = this.matDialog.open(ComboDetailsComponent, {
      data: product,
    });
  }
}
