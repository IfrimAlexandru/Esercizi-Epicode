import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from 'src/app/interface/user.interface';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  user:User = {
    username: "",
    password: "",
  }
onSubmit(form: NgForm) {

}
}
