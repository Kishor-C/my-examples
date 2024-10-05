import { CommonModule, JsonPipe } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProfileService } from '../profile.service';

@Component({
  selector: 'app-profile',
  standalone: true,
  imports: [FormsModule, JsonPipe, ReactiveFormsModule, CommonModule],
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.css'
})
export class ProfileComponent {

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
