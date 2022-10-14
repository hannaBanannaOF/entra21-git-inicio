import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../helpers/auth.service';
import { User } from '../types/types';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

  user: User | null = null;

  constructor(
    private router: Router,
    private authenticationService: AuthenticationService
  ) {
      this.authenticationService.user.subscribe(x => this.user = x);
  }

  logout = () => {
    this.authenticationService.logout();
  }

}
