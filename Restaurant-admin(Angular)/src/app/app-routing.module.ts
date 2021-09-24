import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import { CactivateGuard } from './cactivate.guard';
import { BillsComponent } from './bills/bills.component';
import { TodaysbillsComponent } from './todaysbills/todaysbills.component';
import { UsersComponent } from './users/users.component';
import { GetusersComponent } from './getusers/getusers.component';
import { AdduserComponent } from './adduser/adduser.component';
const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'home',component:HomeComponent,canActivate:[CactivateGuard]},
  {path:'login',component:LoginComponent},
  {path:'thismonthbills',component:BillsComponent},
  {path:'todaysbills',component:TodaysbillsComponent},
  {path:'users',component:UsersComponent},
  {path:'users/getusers',component:GetusersComponent},
  {path:'adduser',component:AdduserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
