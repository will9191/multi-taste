import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../../category.service';

@Component({
  selector: 'app-category-menu',
  imports: [],
  templateUrl: './category-menu.component.html',
  styleUrl: './category-menu.component.scss',
})
export class CategoryMenuComponent implements OnInit {
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
}
