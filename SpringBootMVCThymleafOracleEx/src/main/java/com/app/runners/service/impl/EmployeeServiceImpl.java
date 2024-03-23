package com.app.runners.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.runners.entity.Employee;
import com.app.runners.repo.EmployeeRepository;
import com.app.runners.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public Integer saveEmployee(Employee e) {
		Double hra=e.getEmpSal()*20/100;
		Double ta=e.getEmpSal()*10/100;
		e.setEmphra(hra);
		e.setEmpta(ta);
		e=repo.save(e);
		return e.getEmpId();
	}

	
	public void updateEmployee(Employee e) {
		repo.save(e);

	}

	public void deleteEmployee(Integer id) {
		repo.deleteById(id);

	}

	
	public void getOneEmployee(Integer id) {
		repo.findById(id);

	}

	
	public List<Employee> getAllEmployees() {
		List<Employee>list=repo.findAll();
		return list;
	}

	
	public Page<Employee> getAllEmployees(Pageable pageable) {
		Page<Employee>pages=repo.findAll(pageable);
		return pages;
	}

}
