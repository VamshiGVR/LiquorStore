
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CarOrder } from '../../model/car/carorder';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class CarDataService {
  public baseURL = ["http://localhost:9000/api"];
  constructor(private http: HttpClient) { }


  public GetCarData() {
    return this.http.get<CarOrder[]>(`${this.baseURL}` + "/extract");
  }


  public saveCarData(carorder: CarOrder): Observable<object> {
    return this.http.post<CarOrder>(`${this.baseURL}` + "/add", carorder, { responseType: 'text' as 'json' });
  }

  public DeleteData(id: number): Observable<object> {
    return this.http.delete(`${this.baseURL}/${id}`);
  }
}

