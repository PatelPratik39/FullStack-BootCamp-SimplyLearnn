import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Myservice } from '../custom.service';
import { LogingService } from '../login.service';

@Component({
  selector: 'app-tdf-login',
  templateUrl: './tdf-login.component.html',
  styleUrls: ['./tdf-login.component.css']
})
export class TdfLoginComponent {

  message: string = "";
  messageColor:  string = "";

  constructor(public ls: LogingService){

  }

  checkUser(loginRef: NgForm) : void {
    // alert("Form submitted");
    console.log("Event fired");
    console.log(loginRef.value);
    alert(JSON.stringify(loginRef.value ));
    let login = loginRef.value;
    // if(login.emailId == "chandu@email.com" && login.password == "123"){
    //   this.message = `Login Successful for ${login.emailId}!`;
    //   this.messageColor = "green";
    //   alert(`Success: Login Successful for ${login.emailId}!`);

    // } else {
    //   this.message = `Login Failed for ${login.emailId}.`;
    //   this.messageColor = "red";
    //   alert(`Error: Login Failed for ${login.emailId}.`);
    // }
    // let obj = new Myservice();
    // this.message = obj.checkUserInfo(login);
    this.message = this.ls.checkUserInfo(login)
    loginRef.reset();
  }

}
