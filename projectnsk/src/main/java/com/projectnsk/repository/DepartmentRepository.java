package com.projectnsk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectnsk.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
}
