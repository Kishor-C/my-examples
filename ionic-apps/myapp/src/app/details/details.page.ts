import { Component, inject, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonButton, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { Router } from '@angular/router';
import { DemoComponent } from '../demo/demo.component';

@Component({
  selector: 'app-details',
  templateUrl: './details.page.html',
  styleUrls: ['./details.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonButton, IonTitle, IonToolbar, CommonModule, FormsModule, DemoComponent]
})
export class DetailsPage implements OnInit {

  router = inject(Router);
  constructor() { }

  ngOnInit() {
  }
  goBack() {
    this.router.navigate(['/home'])
  }

}
