import { Component, inject, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-first',
  imports: [FormsModule],
  templateUrl: './first.component.html',
  styleUrl: './first.component.css'
})
export class FirstComponent implements OnInit{
  private _router = inject(Router);
  id !: number;
  ngOnInit(): void {
      
  }
  handleClick() {
    this._router.navigate(['/second-component', "dash"], {queryParams :{id: this.id, name : 'Kishor'}, skipLocationChange: true});
  }
} 
