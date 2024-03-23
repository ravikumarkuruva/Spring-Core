package com.app.runner.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.runner.entity.Student;
import com.app.runner.repo.StudentRepository;
import com.app.runner.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	StudentRepository repo;
	
	public Integer saveStudent(Student s) {
		s=repo.save(s);
		return s.getId();
	}

	
	public void updateStudent(Student s) {
		repo.save(s);

	}

	public void deleteStudent(Student s) {
		repo.delete(s);

	}
	
	public List<Student> getAllStudents() {
		List<Student> list=repo.findAll();
		return list;
	}

}
