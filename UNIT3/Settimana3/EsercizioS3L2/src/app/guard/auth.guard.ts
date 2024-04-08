import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { AuthService } from '../service/auth.service';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class AuthGuard {
  constructor(private authSerivice: AuthService, private router: Router) {}

  canActivate(next:ActivatedRouteSnapshot, state:RouterStateSnapshot): Observable<boolean> | Promise<boolean> | UrlTree | boolean {
    if (this.authSerivice.isLoggedIn.value !== true) {
      this.router.navigate(['login'])
    }
    return true
  }
}
