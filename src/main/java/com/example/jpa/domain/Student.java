package com.example.jpa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    private Integer studentId;

    @Column
    private boolean fullTime;

    @Column
    private Integer age;

    @Embedded
    private Person attendee;

    @OneToMany
    private List<Course> courses = new ArrayList<>();

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getAttendee() {
        return attendee;
    }

    public void setAttendee(Person attendee) {
        this.attendee = attendee;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Student() {
    }

    public Student(boolean fullTime, Integer age, Person attendee) {
        this.fullTime = fullTime;
        this.age = age;
        this.attendee = attendee;
        this.courses = new ArrayList<>();
    }


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer id) {
        this.studentId = id;
    }

}