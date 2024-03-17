package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
  
	@Autowired
	DepartmentRepository departmentRepository;
	
	@PostMapping("/department")
	public Department saveDepartment (@RequestBody Department department) {
	
		return DepartmentService.saveDepartment(department);
	
	}
}

