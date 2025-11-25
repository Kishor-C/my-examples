import { Component, inject, OnInit } from '@angular/core';
import { FormBuilder, FormControl, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {
  builder : FormBuilder = inject(FormBuilder);
  router = inject(Router);
  loginForm = this.builder.group({
    username : ['']
  });
  ngOnInit(): void {
      sessionStorage.clear();
  }
  login() {
    sessionStorage.setItem('loggedIn', 'true');
    let username = <string>this.loginForm.get('username')?.value;
    sessionStorage.setItem('username', username);
    
    this.router.navigate(['success', username]);
  }
}
