import { Component, OnInit } from '@angular/core';
import { Workout } from '../model/workout';
import { WorkoutService } from '../service/workout.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-workout-list',
  templateUrl: './workout-list.component.html',
  styleUrls: ['./workout-list.component.css']
})
export class WorkoutListComponent implements OnInit {

  workouts: Workout[];

  constructor(private route: ActivatedRoute,
                    private router: Router,
                    private workoutService: WorkoutService) {
  }

  getData() {
     this.workoutService.findAll().subscribe(data => {
             console.log("workout data: ", data);
             this.workouts = data;
           });
    }

  ngOnInit() {
    this.getData();
  }

  deleteWorkout(id) {
    this.workoutService.delete(id).subscribe(result => this.getData());
  }

  editWorkout(wkt) {
    this.router.navigate(['/addworkout'], { queryParams: { edit: wkt.id } });
  }

  duplicateWorkout(wkt) {
    this.router.navigate(['/addworkout'], { queryParams: { dup: wkt.id } });
  }


}
