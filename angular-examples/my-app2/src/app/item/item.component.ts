import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-item',
  standalone: false,
  templateUrl: './item.component.html',
  styleUrl: './item.component.css'
})
export class ItemComponent {

  private internalValue : string = "";
  private internalValue2 : string = "";

  @Input()
  get value2() {
    console.log('getValue2:'+this.internalValue2);
    return this.internalValue2;
  }

  set value2(v : string) {
    console.log('before set setValue2:'+this.internalValue2);
    this.internalValue2 = v;
    console.log('after set setValue2:'+this.internalValue2);
  }

  @Input()
  set value(value : string) {
    this.internalValue = value;
  }
  get value() {
    return this.internalValue;
  }
}
