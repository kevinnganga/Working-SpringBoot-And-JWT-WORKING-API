package io.javabrains.springsecurityjwt.filters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
	
	@GetMapping("/ok")
	public String ok() {
		return "Worked";
	}

}
