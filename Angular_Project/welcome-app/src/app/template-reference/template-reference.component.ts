import { Component } from '@angular/core';

@Component({
  selector: 'app-template-reference',
  templateUrl: './template-reference.component.html',
  styleUrls: ['./template-reference.component.css']
})
export class TemplateReferenceComponent {
 message: string = "";
 messageColor: string = '';

passValue (nameRef: any) : void {
  let name: string = nameRef.value
  alert("Why do you clicked me??? : " + name)
}

checkUser(a: any, b: any):  void {
  let emailId = a.value;
  let passowrd = b.value;

  if(emailId == "chandu@email.com" && passowrd == "123"){
    this.message = "success"
    this.messageColor = 'green'
  } else {
    this.message = "failure"
    this.messageColor = 'red'
  }
  a.value=""    // we want reset value in text field 
  b.value=""
}

}
