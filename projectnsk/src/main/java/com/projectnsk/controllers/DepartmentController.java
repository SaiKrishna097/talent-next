package com.projectnsk.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectnsk.entity.Department;
import com.projectnsk.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService depService;
	
	@PostMapping
	public Department saveDepartment(@RequestBody Department department){
		return depService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Optional<Department> findById(@PathVariable("id") Long departmentId) {
		return depService.findDepartmentById(departmentId);
	}
	

}
