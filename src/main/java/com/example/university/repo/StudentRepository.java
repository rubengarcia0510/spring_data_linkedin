package com.example.university.repo;

import com.example.university.domain.Person;
import com.example.university.domain.Student;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * DataSource Management for the Students at the University.
 *
 * Created by maryellenbowman
 */
public interface StudentRepository extends CrudRepository<Student, Integer>{

    List<Student> findByFullTime(boolean fullTime);
    List<Student> findByAge(Integer age);
    List<Student> findByAttendeeLastName(String last);
    Student findByAttendeeFirstNameAndAttendeeLastName(String firstName,String lastName);
    Student findByAttendee(Person person);
    List<Student> findByAgeGreatherThan(int minimumAge);
    List<Student> findByAgeLessThan(int maximumAge);
    List<Student> findByAttendeeLastNameIgnoreCase(String lastName);
    List<Student> findByAttendeeLastNameLike(String lastName);
    Student findFirstByOrderByAttendeeLastNameAsc();
    Student findTopByOrderByAgeDesc();
    List<Student> findTop3ByOrderByAgeDesc();


}
