package ru.saubulprojects.user.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ru.saubulprojects.user.dto.DepartmentDTO;
import ru.saubulprojects.user.dto.ResponseTemplateDTO;
import ru.saubulprojects.user.entity.User;
import ru.saubulprojects.user.repository.UserRepository;
import ru.saubulprojects.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	private final RestTemplate restTemplate;
	
	public UserServiceImpl(UserRepository userRepository,
						   RestTemplate restTemplate) {
		this.userRepository = userRepository;
		this.restTemplate = restTemplate;
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public ResponseTemplateDTO getUserWithDepartment(Long id) {
		User user = userRepository.findById(id).get();
		if(user == null) {
			return null;
		}
		return new ResponseTemplateDTO(userRepository.findById(id).get(),
									   restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId(), 
											   					 DepartmentDTO.class));
	}
	
}
