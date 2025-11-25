import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appHigh2]',
  standalone: false
})
export class High2Directive {

  constructor(private _ele : ElementRef) { }
  @HostListener("mouseenter")
  onMouseEnter() {
    // console.log('mouse entered');
    // this._ele.nativeElement.textContent = 'Click Me'
    this._ele.nativeElement.play();
  }
  @HostListener("mouseleave")
  onMouseLeave() {
    // this._ele.nativeElement.textContent = 'See you again';
    // setTimeout(()=>{
    //   this._ele.nativeElement.textContent = 'Hello';
    // }, 3000);
    this._ele.nativeElement.pause();
  }
}
