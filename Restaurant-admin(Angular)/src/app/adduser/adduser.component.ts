import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../models/User';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {

  constructor(public srvc : UserService,public rtr : Router) { }

  ngOnInit(): void {}
      adduserfrm = new FormGroup({
      uid : new FormControl(),
      uname : new FormControl(),
      pwd : new FormControl()
    })
  user : User;
  addUser(){
    var res = this.srvc.addUser(this.adduserfrm.value["uid"],this.adduserfrm.value["uname"],this.adduserfrm.value["pwd"]).subscribe(
      (response)=>{
        this.user = response;
      },
      (error)=>{
        this.rtr.navigate(["users/getusers"])
        console.log("Error occurred"+error);
      }
    )
  }


}
