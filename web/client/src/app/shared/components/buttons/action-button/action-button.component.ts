import { CommonModule } from '@angular/common';
import { AfterViewInit, Component, ElementRef, Input, OnInit, Renderer2, ViewChild } from '@angular/core';
import { NgIcon } from '@ng-icons/core';

@Component({
  selector: 'app-action-button',
  imports: [NgIcon],
  templateUrl: './action-button.component.html',
  styleUrl: './action-button.component.scss'
})
export class ActionButtonComponent implements AfterViewInit {
  @Input() iconName = '';
  @Input() bgColor = '';
  @Input() color = '';
  @ViewChild('icon') icon: ElementRef | undefined;

  constructor(private renderer: Renderer2) { }

  ngAfterViewInit(): void {
    this.renderer.setStyle(this.icon?.nativeElement, "backgroundColor", `${this.bgColor}`)
    this.renderer.setStyle(this.icon?.nativeElement, "color", `${this.color}`)
    this.renderer.setStyle(this.icon?.nativeElement, "border", `1px solid ${this.bgColor}`)
  }
}
