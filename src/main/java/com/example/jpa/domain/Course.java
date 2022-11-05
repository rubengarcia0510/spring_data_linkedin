package com.example.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private int credits;

    @OneToOne
    private Staff instructor;

    public Course() {
    }

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public Course(String name, int credits, Staff instructor) {
        this.name = name;
        this.credits = credits;
        this.instructor = instructor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}