package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	TestComponent comp; 
	
	@GetMapping
	public String getTestData(@RequestParam String name) {
		comp.setName(name);
		return comp.getNameWithPrefix();
	}
}
