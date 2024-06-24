import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GetCarDataComponent } from './home/admin/get-car-data/get-car-data.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './home/admin/admin.component';
import { CustomerComponent } from './home/customer/customer.component';
import { DeletedCarDataComponent } from './home/admin/deleted-car-data/deleted-car-data.component';
import { PendingpurchaseCarDataComponent } from './home/admin/pendingpurchase-car-data/pendingpurchase-car-data.component';
import { SoldCarDataComponent } from './home/admin/sold-car-data/sold-car-data.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './auth/login/login.component';
import { SignUpComponent } from './auth/sign-up/sign-up.component';
import { ForgotPasswordComponent } from './auth/forgot-password/forgot-password.component';
import { AddCarComponent } from './home/admin/add-car/add-car.component';
import { ViewCarComponent } from './home/admin/get-car-data/view-car/view-car.component';
import { AuthComponent } from './auth/auth.component';

const routes: Routes = [
  { path: "", redirectTo: 'Home', pathMatch: 'full' },
  { path: 'Home', component: HomeComponent },
  { path: "Login", component: LoginComponent },
  { path: "ForgotPassword", component: ForgotPasswordComponent },
  { path: "SignUp", component: SignUpComponent },
  { path: "customer", component: CustomerComponent },
  {
    path: "admin", component: AdminComponent,
    children: [
      { path: "AddCar", component: AddCarComponent },
      { path: "GetCar", component: GetCarDataComponent },
      { path: "GetCar/ViewCar", component: ViewCarComponent },
      { path: "DeletedCar", component: DeletedCarDataComponent },
      { path: "PendingPurchaseCar", component: PendingpurchaseCarDataComponent },
      { path: "SoldCar", component: SoldCarDataComponent }
    ]
  },
  { path: "About", component: AboutComponent },
  { path: "Auth", component: AuthComponent },
  { path: "**", component: HomeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
