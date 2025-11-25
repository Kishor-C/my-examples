import { AfterContentInit, Component, ContentChild } from '@angular/core';
import { HelloComponent } from '../hello/hello.component';

@Component({
  selector: 'app-hello2',
  standalone: false,
  templateUrl: './hello2.component.html',
  styleUrl: './hello2.component.css'
})
export class Hello2Component implements AfterContentInit {
  @ContentChild(HelloComponent) contentHello!: HelloComponent;

  ngAfterContentInit() {
    console.log('Projected HelloComponent:', this.contentHello);
  }
}