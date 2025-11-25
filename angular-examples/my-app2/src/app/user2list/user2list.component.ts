import { Component, inject, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user2list',
  standalone: false,
  templateUrl: './user2list.component.html',
  styleUrl: './user2list.component.css'
})
export class User2listComponent implements OnInit {
  _service : UserService = inject(UserService); 
  userArray : any = undefined;
  ngOnInit() {
    this._service.getUsers3().then(data => this.userArray = data);
  }
}
