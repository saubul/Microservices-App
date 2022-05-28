package ru.saubulprojects.department.service.impl;

import org.springframework.stereotype.Service;

import ru.saubulprojects.department.entity.Department;
import ru.saubulprojects.department.repository.DepartmentRepository;
import ru.saubulprojects.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	private final DepartmentRepository departmentRepository;
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department findById(Long id) {
		return departmentRepository.findById(id).get();
	}
	
}
