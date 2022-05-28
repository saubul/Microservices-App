package ru.saubulprojects.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.saubulprojects.user.annotation.Logged;
import ru.saubulprojects.user.dto.ResponseTemplateDTO;
import ru.saubulprojects.user.entity.User;
import ru.saubulprojects.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	@Logged
	public void saveUser(@RequestBody User user) {
		userService.save(user);
	}
	
	@GetMapping("/{id}")
	@Logged
	public ResponseTemplateDTO getUserWithDepartment(@PathVariable("id") Long id) {
		return userService.getUserWithDepartment(id);
	}
	
}
