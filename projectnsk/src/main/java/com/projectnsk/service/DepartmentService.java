 package com.projectnsk.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectnsk.entity.Department;
import com.projectnsk.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	public Department saveDepartment(Department department){
		return departmentRepository.save(department);

	}
	
	public Optional<Department> findDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId);
	}
	
}
