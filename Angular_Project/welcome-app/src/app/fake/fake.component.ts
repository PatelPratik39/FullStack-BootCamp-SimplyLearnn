import { Component, OnInit } from '@angular/core';
import { FakeService } from '../fake.service';
import { Fake } from '../fake';

@Component({
  selector: 'app-fake',
  templateUrl: './fake.component.html',
  styleUrls: ['./fake.component.css']
})
export class FakeComponent implements OnInit{
  //fakeInfo:Array<Fake>=[];    // here fakeInfo is reference of array of Fake class. 
  fakeInfo:Fake[]=[];
  constructor(public fs:FakeService){  }// DI for FakeService 
  
ngOnInit(): void {
  this.loadFakeData();
}
  loadFakeData(): void {
    this.fs.loadFakeServiceInfo().subscribe({
      next: (result: Fake[]) => {
        this.fakeInfo = result;
      },
      error: (error: any) => {
        console.error(error);
      },
      complete: () => {
        console.log("Done In Component");
      }
    });
  }
}