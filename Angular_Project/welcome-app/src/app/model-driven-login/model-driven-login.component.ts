import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Myservice } from '../custom.service';

@Component({
  selector: 'app-model-driven-login',
  templateUrl: './model-driven-login.component.html',
  styleUrls: ['./model-driven-login.component.css']
})
export class ModelDrivenLoginComponent {

  loginRef = new FormGroup({
    emailId: new FormControl(),
    password: new FormControl()
  })
  message:string = "";
  messageColor: string = ""

  checkUser(): void{
    let login = this.loginRef.value;
    // if(login.emailId == 'chandu@email.com' && login.password == "123"){
    //   this.message="successfully Login"
    //   this.messageColor = "green"
    // } else {
    //    this.message = "Failed Login"
    //    this.messageColor = "red"
    // }
    let obj = new Myservice();
    this.message = obj.checkUserInfo(login)
    this.loginRef.reset();
  }
}
