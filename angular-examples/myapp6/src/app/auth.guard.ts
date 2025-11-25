import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';

export const authGuard: CanActivateFn = (route, state) => {
  let router = inject(Router);
  let username = route.paramMap.get('user');
  if(sessionStorage.getItem('username') ==  username) {
    return true;
  } else {
    alert("You must login first");
    router.navigate(['login']);
    return false;
  }

};
