import { Component, OnInit } from '@angular/core';
import {  FormGroup, FormBuilder, Validators, FormArray } from '@angular/forms';
import { Router } from '@angular/router';
import { PasswordValidator } from '../password.validator';
import { ForbiddenNameValidator } from '../username-validator';
 
@Component({
  selector: 'app-reactivedriven',
  templateUrl: './reactivedriven.component.html',
  styleUrls: ['./reactivedriven.component.css']
})
export class ReactivedrivenComponent implements OnInit {
  
 
  constructor(private fb:FormBuilder,private route:Router) { }
 
  registrationForm: FormGroup;
 
  get username(){
    return this.registrationForm.get('username');
  }
 
  get email(){
    return this.registrationForm.get('email');
  }
  get alternateEmails(){
    return this.registrationForm.get('alternateEmails') as FormArray;
  }
  addAlternateEmail(){
    this.alternateEmails.push(this.fb.control(' '));
  }
 
  ngOnInit(): void {
      this.registrationForm=this.fb.group({
      username:['Raj',[Validators.required,Validators.minLength(3),ForbiddenNameValidator]],
      email:[''],
      subscribe:[false],
      password:[''],
      confirmPassword:[''],
      address:this.fb.group({
       city:[''],
       state:[''],
       postalCode:['']
     }),
     alternateEmails:this.fb.array([])
    }, {validator: PasswordValidator});
 
    this.registrationForm.get('subscribe').valueChanges
      .subscribe(checkedValue => {
        const email = this.registrationForm.get('email');
        if (checkedValue) {
          email.setValidators(Validators.required);
        } else {
          email.clearValidators();
        }
        email.updateValueAndValidity();
      });
  }
sumbitted=false;
onSumbit(){
  console.log("clicked");
  this .sumbitted= true;
  if(this .sumbitted= true){
    this.route.navigate(['/regSuccess']);
  }

}


}
 
  //creating form model
  /*registrationForm=new FormGroup({
    username: new FormControl('Sam'),
    password:new FormControl(''),
    confirmPassword:new FormControl(''),
    address:new FormGroup({
      city:new FormControl(''),
      state:new FormControl(''),
      postalCode:new FormControl('')
 
    })
  });*/
  /*loadApiData(){
    this.registrationForm.setValue({
      username:'Ram',
      password:'test',
      confirmPassword:'test',
      address:{
        city:'chennai',
        state:'tamilnadu',
        postalCode:675217
      }
 
    });
 
    loadApiData()
    {
      this.registrationForm.patchValue({
        username:'Ram',
        password:'test',
        confirmPassword:'test'
      });
    }*/
