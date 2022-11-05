package com.example.jpa;

import com.example.jpa.domain.*;
import com.example.jpa.repo.CourseRepository;
import com.example.jpa.repo.DepartmentRepository;
import com.example.jpa.repo.StaffRepository;
import com.example.jpa.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;
    
    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        boolean fullTime = true;
        System.out.println("Esyo anda");
        Person person1 = new Person("ruben","garcia");
        Staff prof1= staffRepository.save(new Staff(new Person("victor","garcia")));
        Staff prof2 = staffRepository.save(new Staff(new Person("ruben","garcia")));
        Staff prof3 = staffRepository.save(new Staff(new Person("maxi","garcia")));
        System.out.println(prof2.getId());
        Course english101 = courseRepository.save(new Course("English101",2,prof1));

        Student student1 = studentRepository.save(new Student(fullTime,20,person1));

        Course english202 = courseRepository.save(new Course("English202",2,prof2));
        List<Course> cursos = new ArrayList<>();
        cursos.add(english101);
        cursos.add(english202);
        student1.setCourses(cursos);
        
        Department depto1=departmentRepository.save(new Department("Ciencias Sociales"));

    }
}
