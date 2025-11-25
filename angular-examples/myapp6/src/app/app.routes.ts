import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SuccessComponent } from './success/success.component';
import { Component } from '@angular/core';
import { DashboardComponent } from './dashboard/dashboard.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { authGuard } from './auth.guard';

export const routes: Routes = [
    {path: 'login', component : LoginComponent},
    {path: 'success/:user', component : SuccessComponent, canActivate: [authGuard], children : [
        {path : 'dashboard', component : DashboardComponent},
        {path : '', redirectTo : 'dashboard', pathMatch: 'full'}
    ]},
    {path: '', redirectTo: 'login', pathMatch: 'full'},
    {path: '**', component : PageNotFoundComponent}
];
