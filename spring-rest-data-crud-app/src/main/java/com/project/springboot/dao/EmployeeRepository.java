package com.project.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//that's it no need to write any code!!
}
