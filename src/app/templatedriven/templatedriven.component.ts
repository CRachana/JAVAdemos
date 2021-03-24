import {​​​​​​​​ Component, OnInit }​​​​​​​​ from'@angular/core';
import { Router } from '@angular/router';
import {​​​​​​​​ User }​​​​​​​​ from'../user';
 
@Component({​​​​​​​​
selector:'app-templatedriven',
templateUrl:'./templatedriven.component.html',
styleUrls: ['./templatedriven.component.css']
}​​​​​​​​)
export class TemplatedrivenComponent implements OnInit {​​​​​​​​
 


constructor(private route:Router) {​​​​​​​​ }​​​​​​​​
 
ngOnInit(): void {​​​​​​​​
  }​​​​​​​​
 

topics:['Angular','React','Vue'];
userModel=new User("Bob","bob@gmail.com",3548721278,"default","morning",true);


topicHasError =true;
validate(value){
  if (value ==='default')
  {
    this.topicHasError =true;
  }
  else{
    this.topicHasError =false;
  }
}
submitted = false;

onSubmit() {​​​​​​​​
console.log("clicked");
this.submitted=true;
if(this.submitted==true){​​​​​​​​
this.route.navigate(['/regsuccess']);
    }​​​​​​​​
  }​​​​​​​​
 
}​​​​​​​​   

