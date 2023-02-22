package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TestComponent {

	private String name;

	public void setName(String name) {
		this.name = name;
	};
	
	public String getNameWithPrefix() {
		return "Hello " + name;
	}
}
