package com.app.runner.service;

import java.util.List;

import com.app.runner.entity.Student;

public interface IStudentService {
	Integer saveStudent(Student s);
	void updateStudent(Student s);
	void deleteStudent(Student s);
	List<Student> getAllStudents();
}
