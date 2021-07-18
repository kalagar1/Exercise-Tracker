package com.tracker.exercise.repository;

import com.tracker.exercise.entity.Workout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends PagingAndSortingRepository<Workout, Long> {

}
