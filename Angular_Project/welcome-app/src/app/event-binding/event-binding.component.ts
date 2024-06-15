import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent {
  message: string = " Hello"
  function1() : void {
    alert("Event Binding Works!!!");
    this.message = " Ohh you clicked me!!!"
  }
}
