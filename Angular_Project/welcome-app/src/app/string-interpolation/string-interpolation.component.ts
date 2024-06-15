import { Component } from '@angular/core';

@Component({
  selector: 'app-string-interpolation',
  templateUrl: './string-interpolation.component.html',
  styleUrls: ['./string-interpolation.component.css']
})
export class StringInterpolationComponent {
  id: number = 100;
  name: string  = "Baghhera Patel"
  salary : number = 3900.00
  result: boolean  = true

  sayHello(name: string): string {
    return "Welcome user :  " + name
  }
}
