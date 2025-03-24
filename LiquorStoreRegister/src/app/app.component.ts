import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MainScreenComponent } from './main-screen/main-screen.component';

@Component({
  selector: 'app-root',
  standalone: true, 
  imports: [RouterOutlet, MainScreenComponent ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'register';
}
