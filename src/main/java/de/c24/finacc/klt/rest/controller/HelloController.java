package de.c24.finacc.klt.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = "hello")
@RestController
@RequestMapping(value = "/api/v1")
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Engineers at Check24";
	}
}