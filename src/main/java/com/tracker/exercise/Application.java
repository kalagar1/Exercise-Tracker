package com.tracker.exercise;

import com.tracker.exercise.entity.Workout;
import com.tracker.exercise.repository.WorkoutRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hello World");
	}

	@Bean
	CommandLineRunner init(WorkoutRepository workoutRepository) {

		return args -> {
			Workout wkt = new Workout("back day", "Pull-ups: 5*5 35 lbs", LocalDate.now());
			workoutRepository.save(wkt);

			wkt = new Workout("full body day", "Deadlift: 5*3 225 lbs", LocalDate.now());
			workoutRepository.save(wkt);

			wkt = new Workout("mobility work", "Jefferson curl \nHip flexor couch stretch \nShin boxes", LocalDate.now());
			workoutRepository.save(wkt);

			wkt = new Workout("lower body work", "Split squat: 3*5 45 lbs", LocalDate.now());
			workoutRepository.save(wkt);


			workoutRepository.findAll().forEach(System.out::println);
		};

	}

}
