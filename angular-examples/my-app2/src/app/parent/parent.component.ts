import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  standalone: false,
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {
  message = "hi";

  myUser = {id:209, name : "Testing"}
  users = [{id:100, name:"Kishor"}, {id:200, name:"Atharv"}]
}
