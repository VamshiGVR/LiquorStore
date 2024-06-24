import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CartComponent } from './home/customer/cart/cart.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { GetCarDataComponent } from './home/admin/get-car-data/get-car-data.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AdminComponent } from './home/admin/admin.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarAdminComponent } from './home/admin/navbar-admin/navbar-admin.component';
import { NavbarCustomerComponent } from './home/customer/navbar-customer/navbar-customer.component';
import { CustomerComponent } from './home/customer/customer.component';
import { CarDataService } from './home/Services/car-data.service';
import { DeletedCarDataComponent } from './home/admin/deleted-car-data/deleted-car-data.component';
import { SoldCarDataComponent } from './home/admin/sold-car-data/sold-car-data.component';
import { PendingpurchaseCarDataComponent } from './home/admin/pendingpurchase-car-data/pendingpurchase-car-data.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './auth/login/login.component';
import { SignUpComponent } from './auth/sign-up/sign-up.component';
import { ForgotPasswordComponent } from './auth/forgot-password/forgot-password.component';
import { AddCarComponent } from './home/admin/add-car/add-car.component';
import { ViewCarComponent } from './home/admin/get-car-data/view-car/view-car.component';
import { AuthComponent } from './auth/auth.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CartComponent,
    GetCarDataComponent,
    NavbarComponent,
    NavbarCustomerComponent,
    CustomerComponent,
    AdminComponent,
    NavbarAdminComponent,
    FooterComponent,
    DeletedCarDataComponent,
    SoldCarDataComponent,
    PendingpurchaseCarDataComponent,
    AboutComponent,
    LoginComponent,
    SignUpComponent,
    ForgotPasswordComponent,
    AddCarComponent,
    ViewCarComponent,
    AuthComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [CarDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
