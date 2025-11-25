import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  standalone: false,
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
  @Input({required : true})
  user : any = undefined;

  @Input({transform : concat, required : true})
  text : any = undefined;

  @Output()
  userEmitter : EventEmitter<string> = new EventEmitter<string>();
  handleClick() {
    this.userEmitter.emit(this.user.name.toUpperCase());
  }
}

function concat(value : string | undefined) {
  return value?.concat('hello world').toUpperCase();
}