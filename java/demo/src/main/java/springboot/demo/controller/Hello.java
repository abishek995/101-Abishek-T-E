package springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
	@RestController
	@RequestMapping(path="/hello")
	public class Hello {
	@GetMapping("/")
	public String sayHello()
	{
		return"This is my world";
	}
}
