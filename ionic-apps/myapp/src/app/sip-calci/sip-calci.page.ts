import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';

@Component({
  selector: 'app-sip-calci',
  templateUrl: './sip-calci.page.html',
  styleUrls: ['./sip-calci.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule]
})
export class SipCalciPage implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
