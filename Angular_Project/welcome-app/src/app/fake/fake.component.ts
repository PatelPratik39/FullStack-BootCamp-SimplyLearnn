import { Component } from '@angular/core';
import { FakeService } from '../fake.service';

@Component({
  selector: 'app-fake',
  templateUrl: './fake.component.html',
  styleUrls: ['./fake.component.css']
})
export class FakeComponent {

  // DI Service 
  constructor(public fs: FakeService){

  }

  loadFakeData(): void {
    // alert("Event fired")
    this.fs.loadFakeService();    //calling service
  }

}
