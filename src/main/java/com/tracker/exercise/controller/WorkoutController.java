package com.tracker.exercise.controller;

import com.tracker.exercise.entity.Workout;
import com.tracker.exercise.repository.WorkoutRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WorkoutController {

    private final WorkoutRepository workoutRepository;

    public WorkoutController(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @GetMapping("/workouts")
    public List<Workout> getWorkouts() {
        System.out.println("\n");
        workoutRepository.findAll().forEach(System.out::println);

        return (List<Workout>) workoutRepository.findAll();
    }

    @PostMapping("/workouts")
    public void addWorkout(@RequestBody Workout wkt) {
        workoutRepository.save(wkt);
    }

    @DeleteMapping("/workouts/delete/{id}")
    public void deleteWorkout(@PathVariable String id) {
        workoutRepository.deleteById(Long.valueOf(id));
    }

}