package ru.saubulprojects.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.saubulprojects.department.annotation.Logged;
import ru.saubulprojects.department.entity.Department;
import ru.saubulprojects.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	private final DepartmentService departmentService;
	
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	@PostMapping
	@Logged
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.save(department);
	}
	
	@GetMapping("/{id}")
	@Logged
	public Department findDepartmentById(@PathVariable("id") Long id) {
		return departmentService.findById(id);
	}
	
}
