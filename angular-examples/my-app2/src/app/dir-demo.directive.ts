import { Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appDirDemo]',
  standalone: false
})
export class DirDemoDirective {

  constructor() { }

  @HostBinding("style.color") color : any;

  @HostListener("click")
  onclick() {
    this.color = 'red';
  }
}
