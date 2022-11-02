package com.example.university;

import com.example.university.domain.Student;
import com.example.university.repo.StudentRepository;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryDemo {
    @Autowired
    StudentRepository studentRepository;

    public void simpleQueryDemo(){
        studentRepository.findByAge(20).forEach(System.out::println);
    }

}
