import { Component, OnInit } from '@angular/core';
import { ApiService } from './services/api.service';
import { MainPageComponent } from "./main-page/main-page.component";

@Component({
  selector: 'app-root',
  imports: [MainPageComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  message: string = '';

  constructor(private apiService: ApiService) {}

  ngOnInit(): void {
    this.apiService.getHelloMessage().subscribe(
      (data) => this.message = data,
      (error) => console.error('Error:', error)
    );
  }
}