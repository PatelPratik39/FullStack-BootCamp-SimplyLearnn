import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';


@Injectable({
  providedIn: 'root'   
})
// @Injectable()
export class FakeService {

  constructor(public http:HttpClient) { }

  // always take 3 parameters
  loadFakeService() : void{
    this.http.get("https://freetestapi.com/api/v1/products").subscribe({
      next: (result:any) => {
        console.log(result); 
      },
      error:(error:any) => {
        console.error("Eror gets called : " , error);
      },
      complete : () => {
          console.log("Done!!!!");
          
      },
    })
  }
}
