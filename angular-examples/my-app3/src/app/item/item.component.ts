import { NgFor } from '@angular/common';
import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrl: './item.component.scss'
})
export class ItemComponent implements 
  OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {
  @Input()
  childInput : string = "";
  previous : string = "";
  timerMessage = "Default";
  firstChange : boolean = false;


  handleTimer() {
    setTimeout(()=>{
      this.timerMessage = "Timer called after 10s"
    },1000);
  }

  ngOnInit(): void {
      console.log('ngOnit() in Item component')
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('ngOnChanges:',changes);
   this.previous = changes['childInput'].previousValue;
   this.firstChange = changes['childInput'].firstChange;
  }
  constructor() {
    console.log('constructor() item component');
  }
   ngDoCheck(): void {
      console.log('ngDoCheck()')
  }
  ngAfterContentInit(): void {
      console.log('ngAfterContentInit()');
  }
  ngAfterContentChecked(): void {
      console.log('ngAfterContentChecked()');
  }
  ngAfterViewInit(): void {
      console.log('afterViewInit()')
  }
  ngAfterViewChecked(): void {
      console.log('afterViewChecked()');
  }
  ngOnDestroy() {
    console.log('destroyed');
  }
}
