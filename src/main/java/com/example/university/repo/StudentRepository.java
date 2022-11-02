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
    List<Student> findByAttendeLastName(String last);
    Student findByAttendeFirstNameAndAttendeLastName(String firstName,String lastName);
    Student findByAttende(Person person);

    default <S extends Student> S save(S s) {
        return null;
    }

    default <S extends Student> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    default Optional<Student> findById(Integer integer) {
        return Optional.empty();
    }

    default boolean existsById(Integer integer) {
        return false;
    }

    default Iterable<Student> findAll() {
        return null;
    }

    default Iterable<Student> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    default long count() {
        return 0;
    }

    default void deleteById(Integer integer) {

    }

    default void delete(Student student) {

    }

    default void deleteAll(Iterable<? extends Student> iterable) {

    }

    default void deleteAll() {

    }
}
