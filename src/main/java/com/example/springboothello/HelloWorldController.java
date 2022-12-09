package com.example.springboothello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  


@RestController  
public class HelloWorldController   
{  
	@RequestMapping("/hello")  
	public String hello()   
	{  
		return "Hello World from spring-boot!!";
	}  
	
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {
		return name+", Welcome to Spring-Boot Family..!!";
	}
}  