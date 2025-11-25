import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { 
  IonAlert,
  IonHeader, IonToolbar, IonTitle, IonContent, IonButton, IonIcon } from '@ionic/angular/standalone';
import { addIcons } from 'ionicons';
import {heart, airplane, alarm, basket, baseball} from 'ionicons/icons'
@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  imports: [IonHeader, IonAlert, IonTitle, IonContent, IonButton, IonIcon, RouterLink],
})
export class HomePage {
  alertButtons = ['Action'];
  constructor() {
    addIcons({heart, airplane, alarm, basket, baseball})
  }

  handleClick() {
    alert('hello world');
  }
  
}
