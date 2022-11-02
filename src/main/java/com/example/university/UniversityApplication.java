package com.example.university;

import com.example.university.domain.*;
import com.example.university.repo.CourseRepository;
import com.example.university.repo.DepartmentRepository;
import com.example.university.repo.StaffRepository;
import com.example.university.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot Class for the University Application.
 * <p>
 * Created by maryellenbowman
 */

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	StaffRepository staffRepository;

	@Autowired
	StudentRepository studentRepository;
	public static void main(String[] args) {

		SpringApplication.run(UniversityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		boolean fullTime=true;
		studentRepository.save(new Student(new Person("Ruben","Garcia"),fullTime,50));
		studentRepository.save(new Student(new Person("Maxi","Garcia"),fullTime,9));
		studentRepository.save(new Student(new Person("Rocio","Garcia"),fullTime,12));
		studentRepository.save(new Student(new Person("Silvia","Soria"),fullTime,51));

		Staff juanPerez = staffRepository.save(new Staff(new Person("Juan","Perez")));
		Staff pedroPerez = staffRepository.save(new Staff(new Person("Pedro","Perez")));
		Staff profJulianPerez = staffRepository.save(new Staff(new Person("Julian","Perez")));
		Staff profRobertoPerez = staffRepository.save(new Staff(new Person("Roberto","Perez")));
		Staff profFedericoPerez = staffRepository.save(new Staff(new Person("Federico","Perez")));
		Staff profjosePerez = staffRepository.save(new Staff(new Person("Jose","Perez")));
		Staff profcamiloPerez = staffRepository.save(new Staff(new Person("Camilo","Perez")));
		Staff proffranciscoPerez = staffRepository.save(new Staff(new Person("Francisco","Perez")));
		Staff facundoPerez = staffRepository.save(new Staff(new Person("Facundo","Perez")));
		Staff pacoPerez = staffRepository.save(new Staff(new Person("Paco","Perez")));
		Staff manuelPerez = staffRepository.save(new Staff(new Person("Manuel","Perez")));

		Department humanidades = departmentRepository.save(new Department("Humanidades",juanPerez));
		Department cienciasNaturales = departmentRepository.save(new Department("Ciencias Naturales",pedroPerez));
		Department cienciasSociales = departmentRepository.save(new Department("Ciencias Sociales",juanPerez));

		Course english101 = courseRepository.save(new Course("English 101",3,profRobertoPerez,humanidades));
		Course english201 = courseRepository.save(new Course("English 201",3,profRobertoPerez,humanidades));
		Course english202 = courseRepository.save(new Course("English 202",3,profFedericoPerez,humanidades));

		Course chemistry = courseRepository.save(new Course("Chemistry",3,proffranciscoPerez,cienciasNaturales));
		Course physics = courseRepository.save(new Course("Physics",3,profcamiloPerez,cienciasNaturales));
		Course algebra = courseRepository.save(new Course("Algebra",3,proffranciscoPerez,cienciasNaturales));
		Course geometria = courseRepository.save(new Course("Geometria",3,profcamiloPerez,cienciasNaturales));

		Course historia = courseRepository.save(new Course("Historia",3,profJulianPerez,cienciasSociales));
		Course literatura = courseRepository.save(new Course("Literatura",3,profFedericoPerez,cienciasSociales));
		Course sociedadYEstado = courseRepository.save(new Course("Sociedad y Estado",3,profJulianPerez,cienciasSociales));
		Course plastica = courseRepository.save(new Course("Plastica",3,profFedericoPerez,cienciasSociales));



	}
}
