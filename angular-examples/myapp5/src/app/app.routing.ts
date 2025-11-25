import { Routes } from "@angular/router"
import { FirstComponent } from "./first/first.component"
import { SecondComponent } from "./second/second.component"
import { PageNotFoundComponent } from "./page-not-found/page-not-found.component"
import { ChildAComponent } from "./child-a/child-a.component"
import { ChildBComponent } from "./child-b/child-b.component"
import { authGuard } from "./auth.guard"
import { LoginComponent } from "./login/login.component"

export const routes : Routes = [
    {path : 'login-component', component : LoginComponent},
    {path : 'first-component', component : FirstComponent},
    {path : 'second-component/:id', component : SecondComponent, canActivate: [authGuard], children : [
        {path : 'child-a', component : ChildAComponent}, 
        {path : 'child-b', component : ChildBComponent}
    ]},
    {path : '', redirectTo : 'login-component', pathMatch: 'full'},
    
    {path : '**', component : PageNotFoundComponent},
    
]