package com.app.runner.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.runner.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
