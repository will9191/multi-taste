import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-delete-modal',
  imports: [],
  templateUrl: './delete-modal.component.html',
  styleUrl: './delete-modal.component.scss'
})
export class DeleteModalComponent {
  constructor(
    private ref: MatDialogRef<DeleteModalComponent>,
    @Inject(MAT_DIALOG_DATA) public data: {
      id: number,
      img: string,
      name: string
    }
  ) { }

  onConfirm(response: boolean): void {
    this.ref.close(response);
  }
}
