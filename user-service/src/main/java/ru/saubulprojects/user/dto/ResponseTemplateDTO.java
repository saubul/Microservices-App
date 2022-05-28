package ru.saubulprojects.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.saubulprojects.user.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateDTO {
	
	private User user;
	private DepartmentDTO department;
	
}
