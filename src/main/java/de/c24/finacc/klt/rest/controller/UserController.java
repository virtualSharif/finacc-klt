package de.c24.finacc.klt.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.c24.finacc.klt.business.service.UserService;
import de.c24.finacc.klt.persistance.entity.User;
import io.swagger.annotations.Api;

@Api(tags = "user")
@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("/age/{age}")
	public String validate(@PathVariable Integer age) {
		return userService.validate(age);
	}

	@PostMapping
	public User save(@RequestBody User user) {
		return userService.save(user);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
	}

}