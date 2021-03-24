import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ReactivedrivenComponent } from './reactivedriven/reactivedriven.component';
import { RegsuccessComponent } from './regsuccess/regsuccess.component';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';

const routes: Routes = [
  {
    path:'regSuccess',
    component: RegsuccessComponent
  },

  
{ path:'templatedriven',
component: TemplatedrivenComponent},


{ path:'reactivedriven',
component: ReactivedrivenComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }



