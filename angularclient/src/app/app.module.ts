import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { WorkoutListComponent } from './workout-list/workout-list.component';
import { WorkoutFormComponent } from './workout-form/workout-form.component';
import { AppRoutingModule } from './/app-routing.module';
import { WorkoutService } from './service/workout.service';



@NgModule({
  declarations: [
    AppComponent,
    WorkoutListComponent,
    WorkoutFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [WorkoutService],
  bootstrap: [AppComponent]
})

export class AppModule { }
