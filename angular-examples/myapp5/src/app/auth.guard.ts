import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';

export const authGuard: CanActivateFn = (route, state) => {
  let id = route.queryParamMap.get('id');
  console.log(id);
  if(id != undefined) {
    return true;
  }
  alert('you must login first');
  let router = inject(Router);
  router.navigate(['login-component'])
  return false;
};
