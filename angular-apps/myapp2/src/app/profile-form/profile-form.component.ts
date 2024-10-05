import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ProfileService } from '../profile.service';

@Component({
  selector: 'app-profile-form',
  templateUrl: './profile-form.component.html',
  styleUrl: './profile-form.component.css'
})
export class ProfileFormComponent {

  constructor(private builder : FormBuilder, private service: ProfileService) {}

  profileForm = this.builder.group({
    name : [], dob : []
  });
  users : any[] | undefined = undefined;
  handleSubmit() {
    console.log(this.profileForm.value);
  }
  handleClick() {
    this.service.fetchAll().subscribe({
      next : (value) => this.users = value,
      error : (err) => console.log(err)
    })
  }
}
