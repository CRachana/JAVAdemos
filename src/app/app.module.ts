import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TemplatedrivenComponent } from './templatedriven/templatedriven.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegsuccessComponent } from './regsuccess/regsuccess.component';
import { ReactivedrivenComponent } from './reactivedriven/reactivedriven.component';
import { DatepipeComponent } from './datepipe/datepipe.component';
import { RegsucessComponent } from './regsucess/regsucess.component';

@NgModule({
  declarations: [
    AppComponent,
    TemplatedrivenComponent,
    RegsuccessComponent,
    ReactivedrivenComponent,
    DatepipeComponent,
    RegsucessComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }




