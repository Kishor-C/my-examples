import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: false,
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'my-demo-app19';
  items = [10, 20, 30, 40];
  username : string | undefined = "Kishor"
}
