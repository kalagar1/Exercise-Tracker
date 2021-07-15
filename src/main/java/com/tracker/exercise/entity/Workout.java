package com.tracker.exercise.entity;

import javax.persistence.*;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private final String name;

    public Workout() {
        this.name = "hi";
    }

    public Workout(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                '}';
    }
}
