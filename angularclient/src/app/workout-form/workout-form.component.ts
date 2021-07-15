import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { WorkoutService } from '../service/workout.service';
import { Workout } from '../model/workout';

@Component({
  selector: 'app-workout-form',
  templateUrl: './workout-form.component.html',
  styleUrls: ['./workout-form.component.css']
})
export class WorkoutFormComponent {

  workout: Workout;

  constructor(
    private route: ActivatedRoute,
      private router: Router,
        private workoutService: WorkoutService) {
    this.workout = new Workout();
  }

  onSubmit() {
    this.workoutService.save(this.workout).subscribe(result => this.gotoWorkoutList());
  }

  gotoWorkoutList() {
    this.router.navigate(['/workouts']);
  }

}
