import { Component, inject } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-success',
  imports: [],
  templateUrl: './success.component.html',
  styleUrl: './success.component.css'
})
export class SuccessComponent {
  username : string | undefined = undefined;
  activated : ActivatedRoute = inject(ActivatedRoute);
  ngOnInit() {
    this.activated.paramMap.subscribe({
      next : value => this.username = <string>value.get('user')
    })
  }
}
