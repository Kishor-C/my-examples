import { Component, inject, OnInit } from '@angular/core';
import { ActivatedRoute, Params, RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-second',
  imports: [RouterOutlet, RouterLink],
  templateUrl: './second.component.html',
  styleUrl: './second.component.css'
})
export class SecondComponent implements OnInit{
  private _activatedRoute : ActivatedRoute = inject(ActivatedRoute);

  ngOnInit(): void {
      this._activatedRoute.queryParams.subscribe({
        next : (value) => console.log(value)
      })
      this._activatedRoute.paramMap.subscribe(
        {
          next : (value:Params) => console.log(value['params'].id)
        }
      )
  }
}
