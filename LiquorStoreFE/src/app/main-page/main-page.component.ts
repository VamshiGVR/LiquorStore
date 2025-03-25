import { Component } from '@angular/core';
import { NavBarComponent } from "./nav-bar/nav-bar.component";
import { TailBarComponent } from "./tail-bar/tail-bar.component";

@Component({
  selector: 'app-main-page',
  imports: [NavBarComponent, TailBarComponent],
  templateUrl: './main-page.component.html',
  styleUrl: './main-page.component.css'
})
export class MainPageComponent {

}
