import { Component, inject, OnDestroy, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { PartialObserver, Subscription } from 'rxjs';
import { User } from '../mock/users';

@Component({
  selector: 'app-user-list',
  standalone: false,
  templateUrl: './user-list.component.html',
  styleUrl: './user-list.component.css'
})
export class UserListComponent implements OnInit, OnDestroy{
  private _service : UserService = inject(UserService);
  private _subscriber : Subscription | undefined = undefined;
  user !: User;
  userArray : User[] = [];
  ngOnInit(): void {
    this._subscriber = 
      this._service.getUsers().subscribe({
        next : (userItems: User) => {this.userArray.push(userItems); this.user = userItems},
        error : (error) => console.error('Error occured'),
        complete : () => console.log('fetch complete')
      });
  }
  ngOnDestroy(): void {
      this._subscriber?.unsubscribe();
  }
  stopSubscription() {
    this._subscriber?.unsubscribe();
  }
}
