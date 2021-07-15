package com.tracker.exercise;

import com.tracker.exercise.entity.Workout;
import com.tracker.exercise.repository.WorkoutRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				Workout wkt = new Workout(name);
				workoutRepository.save(wkt);
			});
			workoutRepository.findAll().forEach(System.out::println);
		};
	}

}
