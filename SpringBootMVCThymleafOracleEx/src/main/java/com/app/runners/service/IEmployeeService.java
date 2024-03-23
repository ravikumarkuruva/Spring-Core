package com.app.runners.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.runners.entity.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee e);
	void updateEmployee(Employee e);
	void deleteEmployee(Integer id);
	void getOneEmployee(Integer id);
	List<Employee> getAllEmployees();
	Page<Employee> getAllEmployees(Pageable pageable);
}
