package ru.saubulprojects.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.saubulprojects.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
