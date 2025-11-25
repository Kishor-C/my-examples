import { Directive, ElementRef, HostListener, inject } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
  standalone: false
})
export class HighlightDirective {

  constructor(private _ele : ElementRef) {}

  // @HostListener("mouseenter") onMouseEnter() {
  //   console.log('mouse entered');
  // }

  // private el = inject(ElementRef);
  // @HostListener('mouseenter') onMouseEnter() {
  //   this.highlight('yellow');
  // }
  // @HostListener('mouseleave') onMouseLeave() {
  //   this.highlight('');
  // }
  // private highlight(color: string) {
  //   this.el.nativeElement.style.backgroundColor = color;
  // }
  // //constructor(private _ele : ElementRef) {}
  // private _ele = inject(ElementRef)
  @HostListener('mouseenter') onMouseEnter2() {
   console.log('mouse entering')
    this.highlight('yellow');
  } 
  // @HostListener('mouseenter') onMouseLeave() {
  //  this.highlight('');
  // }
  private highlight(color : string) {
    this._ele.nativeElement.style.backgroundColor = color;
  }
}
