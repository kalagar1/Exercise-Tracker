import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Workout } from '../model/workout';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class WorkoutService {

  private url: string;

  constructor(private http: HttpClient) {
    this.url = 'http://localhost:8080/workouts';
  }

  public findAll(): Observable<Workout[]> {
    return this.http.get<Workout[]>(this.url);
  }

  public save(workout: Workout) {
    return this.http.post<Workout>(this.url, workout);
  }

  public delete(id) {
    return this.http.delete(this.url+"/delete/"+id);
  }
}
