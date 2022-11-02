package com.example.university.domain;

import javax.persistence.*;

/**
 * JPA Entity for a Course offered at the University.
 * <p>
 * Created by maryellenbowman.
 */
@Entity
@Table(name = "COURSE")
public class Course {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private int credits;

    @ManyToOne
    @JoinColumn
    private Department department;

    @Embedded
    private Staff instructor;

    public Course(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Course(String name, int credits, Staff instructor, Department department) {
        this.name = name;
        this.credits = credits;
        this.department = department;
        this.instructor = instructor;
    }

    protected Course() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id + ", name='" + name + '\'' + ", department=" + department.getName() + '}';
    }
}
