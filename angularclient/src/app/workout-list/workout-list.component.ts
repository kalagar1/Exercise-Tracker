import { Component, OnInit } from '@angular/core';
import { Workout } from '../model/workout';
import { WorkoutService } from '../service/workout.service';

@Component({
  selector: 'app-workout-list',
  templateUrl: './workout-list.component.html',
  styleUrls: ['./workout-list.component.css']
})
export class WorkoutListComponent implements OnInit {

  workouts: Workout[];

  constructor(private workoutService: WorkoutService) {
  }

  ngOnInit() {
      this.workoutService.findAll().subscribe(data => {
        this.workouts = data;
      });
  }

}
