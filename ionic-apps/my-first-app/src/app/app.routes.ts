import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./tabs/tabs.routes').then((m) => m.routes),
  },
  {
    path: 'user-detail',
    loadComponent: () => import('./user-detail/user-detail.page').then( m => m.UserDetailPage)
  },
];
