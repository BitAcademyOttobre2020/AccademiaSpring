package it.bit.accademiaspring.repo;

import org.springframework.data.repository.CrudRepository;

import it.bit.accademiaspring.model.Course;
import it.bit.accademiaspring.model.Student;

public interface CourseSpringRepo extends CrudRepository<Course, Integer> , CourseSpringRepoExt{
	
}
