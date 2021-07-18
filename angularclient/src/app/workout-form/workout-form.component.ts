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

  ngOnInit() {
     this.route.queryParams
          .subscribe(params => {
            if params.edit {
                this.workoutService.findById(params.edit).subscribe(result => this.workout = result);
            } else if params.dup {
                this.workoutService.findById(params.dup).subscribe(result => {
              delete result.id;
                this.workout = result;
              });
            }
          }
        );
  }

  onSubmit() {
    this.workoutService.save(this.workout).subscribe(result => this.gotoWorkoutList());
  }

  gotoWorkoutList() {
    this.router.navigate(['/workouts']);
  }



}
