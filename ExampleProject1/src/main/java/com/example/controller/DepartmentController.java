package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Department;
import com.example.service.DepartmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DepartmentController {
 
      @Autowired
     private DepartmentService departmentService;

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

     @PostMapping("path")
     public Department saveDepartment(@RequestBody Department department) {
         //TODO: process POST request
         
         return DepartmentService.saveDepartment(department);
         
      
     }
     
	
	
}
