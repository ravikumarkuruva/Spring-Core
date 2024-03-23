package com.app.runners.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.runners.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
