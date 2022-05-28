package ru.saubulprojects.department.service;

import ru.saubulprojects.department.entity.Department;

public interface DepartmentService {

	Department save(Department department);

	Department findById(Long id);

}
