package ru.saubulprojects.user.service;

import ru.saubulprojects.user.dto.ResponseTemplateDTO;
import ru.saubulprojects.user.entity.User;

public interface UserService {
	
	User save(User user);
	
	User findById(Long id);

	ResponseTemplateDTO getUserWithDepartment(Long id);
}
