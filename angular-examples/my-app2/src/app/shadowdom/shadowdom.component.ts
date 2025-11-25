import { Component, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-shadowdom',
  standalone: false,
  templateUrl: './shadowdom.component.html',
  styleUrl: './shadowdom.component.css',
  encapsulation : ViewEncapsulation.ShadowDom
})
export class ShadowdomComponent {

}
