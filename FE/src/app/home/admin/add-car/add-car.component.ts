import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CarDataService } from '../../Services/car-data.service';
import { CarOrder } from '../../../model/car/carorder';

@Component({
  selector: 'app-add-car',
  templateUrl: './add-car.component.html',
  styleUrl: './add-car.component.css'
})
export class AddCarComponent {
  CloseModal() {
    this.isModalVisible = false;
  }

  carorder: CarOrder = new CarOrder();
  message: String = " ADDED SUCCEFFULLY"
  isModalVisible = false;
  constructor(private router: Router, private carservicedata: CarDataService) { }


  OnSubmit(carorder: any) {
    this.carservicedata.saveCarData(this.carorder).subscribe(_data => console.log("data added"));
    const OpenModal = document.getElementById("AddedSuccessfullyModal");
    this.isModalVisible = true;
    // if (OpenModal != null) {
    //   OpenModal.style.display = 'block';
    console.log(carorder);
  }
}

//CloseModal() {
//const OpenModal = document.getElementById("AddedSuccessfullyModal");
//if (OpenModal != null) {
//  OpenModal.style.display = 'none';
//  this.router.navigate(['/admin/AddCar']);
//}
//}


