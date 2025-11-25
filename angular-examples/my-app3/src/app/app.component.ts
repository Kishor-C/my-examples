import { NgFor, NgIf } from '@angular/common';
import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { ItemComponent } from './item/item.component';
import { FormsModule } from '@angular/forms';
import { ChildComponent } from './child/child.component';

@Component({
  selector: 'app-root',

  imports: [NgFor, NgIf, ItemComponent, FormsModule, ChildComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnChanges, OnInit{
  parentInput = 'my-app3';
  show : boolean = true;
  handleClick() {
    this.show = !this.show;
  }
  ngOnChanges(changes: SimpleChanges): void {
     // console.log('ngOnChanges in AppComponent')
  }
  ngOnInit(): void {
      //console.log('ngOnInit() in AppComponent')
  }
}
