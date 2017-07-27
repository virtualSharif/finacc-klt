package de.c24.finacc.klt.business.service;

import java.util.List;

import de.c24.finacc.klt.persistance.entity.User;

public interface UserService {

	public List<User> findAll();

	public User save(User user);

	public void delete(Integer id);

	public String validate(Integer age);

}
