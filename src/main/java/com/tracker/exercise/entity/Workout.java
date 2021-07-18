package com.tracker.exercise.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String body;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private final LocalDate date;

    public Workout() {
        this.date = LocalDate.now();
        this.name = "";
        this.body = "";
    }

    public Workout(String name, String body, LocalDate date) {
        this.name = name;
        this.body = body;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public LocalDate getDate() {
        return date;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", date=" + date +
                '}';
    }
}
