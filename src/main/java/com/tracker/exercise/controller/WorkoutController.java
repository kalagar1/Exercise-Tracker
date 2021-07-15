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

    @GetMapping("/users")
    public List<Workout> getUsers() {
        return (List<Workout>) workoutRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody Workout wkt) {
        workoutRepository.save(wkt);
    }
}