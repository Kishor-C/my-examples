import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmulatedComponent } from './emulated/emulated.component';
import { ShadowdomComponent } from './shadowdom/shadowdom.component';
import { NoneComponent } from './none/none.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { JoinNamesImpurePipe } from './join-names-impure.pipe';
import { DateImpurePipe } from './date-impure.pipe';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { ItemListComponent } from './item-list/item-list.component';
import { ItemComponent } from './item/item.component';
import { AppDirDirective } from './app-dir.directive';
import { HighlightDirective } from './highlight.directive';
import { High2Directive } from './high2.directive';
import { DirDemoDirective } from './dir-demo.directive';
import { HelloComponent } from './hello/hello.component';
import { Hello2Component } from './hello2/hello2.component';
import { UserListComponent } from './user-list/user-list.component';
import { User2listComponent } from './user2list/user2list.component';
import { TodoAddComponent } from './todo-add/todo-add.component';
import { TodoReadComponent } from './todo-read/todo-read.component';
import { TodoEditComponent } from './todo-edit/todo-edit.component';
import { TodoDeleteComponent } from './todo-delete/todo-delete.component';
import { provideHttpClient } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    
    EmulatedComponent,
    ShadowdomComponent,
    NoneComponent,
    JoinNamesImpurePipe,
    DateImpurePipe,
    ParentComponent,
    ChildComponent,
    ItemListComponent,
    ItemComponent,
    AppDirDirective,
    HighlightDirective,
    High2Directive,
    DirDemoDirective,
    HelloComponent,
    Hello2Component,
    UserListComponent,
    User2listComponent,
    TodoAddComponent,
    TodoReadComponent,
    TodoEditComponent,
    TodoDeleteComponent
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule
  ],
  providers: [provideHttpClient()],
  bootstrap: [AppComponent]
})
export class AppModule { }
