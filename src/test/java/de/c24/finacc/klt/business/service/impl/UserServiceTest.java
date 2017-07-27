package de.c24.finacc.klt.business.service.impl;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.c24.finacc.klt.business.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void checkDependencyInjection() {
		assertThat(userService, instanceOf(UserService.class));
	}

	@Test
	public void shouldSendStatusAsfunny() {
		String expected = "funny";
		String status = userService.validate(19);
		assertEquals(status, expected);
	}

	@Test
	public void shouldSendStatusAsOk() {
		String expected = "OK";
		String status = userService.validate(32);
		assertEquals(status, expected);
	}

	@Test
	public void shouldSendStatusAsOld() {
		String expected = "too old";
		String status = userService.validate(91);
		assertEquals(status, expected);
	}

	@Test
	public void shouldSendStatusAsYoung() {
		String expected = "too young";
		String status = userService.validate(12);
		assertEquals(status, expected);
	}

}