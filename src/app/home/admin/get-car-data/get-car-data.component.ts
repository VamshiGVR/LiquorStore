import { Component, OnInit } from '@angular/core';
import { CarDataService } from '../../Services/car-data.service';
import { CarOrder } from '../../../model/car/carorder';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-car-data',
  templateUrl: './get-car-data.component.html',
  styleUrl: './get-car-data.component.css'
})
export class GetCarDataComponent implements OnInit {

  cars: CarOrder[] = [];
  constructor(private cardataService: CarDataService, private router: Router) { };
  ngOnInit(): void {
    this.GetCarData();
  }

  GetCarData() {
    this.cardataService.GetCarData().subscribe(data => this.cars = data);
  }

  ActionSold() {
    throw new Error('Method not implemented.');
  }

  ActionInPending() {
    throw new Error('Method not implemented.');
  }
  ViewOrEdit() {
    this.router.navigate(['admin/GetCar/ViewCar']);
  }

  //NEED TO WORK MORE
  DeleteData(id: number) {
    /* const DeleteDataModal = document.getElementById("DELETEDATAMODAL")
     if (DeleteDataModal != null) {
       DeleteDataModal.style.display = ('block');
     }*/
    this.cardataService.DeleteData(id).subscribe(data => { this.GetCarData() });
  }
}






//
