package com.app.runners;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends 
				CrudRepository<Student, Integer> {

}
