import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'forms';
  constructor(private route:Router)
  {
  this.route.navigate(['/template'])
 // this.route.navigate(['/reactive'])
  }
}
