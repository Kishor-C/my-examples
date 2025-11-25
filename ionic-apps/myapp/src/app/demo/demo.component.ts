import { Component, inject, OnInit } from '@angular/core';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { IonContent, IonButton, IonHeader, IonTitle, IonToolbar, IonLoading } from '@ionic/angular/standalone';
@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.scss'],
  standalone : true,
  imports : [ReactiveFormsModule,IonContent, IonButton, IonHeader, IonTitle, IonToolbar, IonLoading]
})
export class DemoComponent  implements OnInit {

  constructor() { }

  ngOnInit() {}

  builder = inject(FormBuilder);
  loginForm = this.builder.group({
    username : [], password : []
  });
}
