package com.zlabs.ms.msactuator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String sayHello(@RequestParam(name="name") String name) {
		return "Hello " + name;
	}
	
}