package com.sean.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	private String goBack = "<a href='/'>Go Back</a>";
	private String welcomeSpring = "<p>Welcome to SpringBoot!</p>";
	private String helloStartDiv = "<div style='display: flex; justify-content: space-between;'><h1>Hello ";
	@RequestMapping("")
	public String helloHuman(@RequestParam(value="name", required=false) String nameQuery, 
			@RequestParam(value="last_name", required = false) String lnameQuery) {
		if (nameQuery != null && lnameQuery != null) {
			return helloStartDiv + nameQuery + " " + lnameQuery +"!</h1>" + goBack +"</div>"
					+ welcomeSpring;
		} else if (nameQuery != null) {
			return  helloStartDiv + nameQuery + "!</h1>" + goBack +"</div>"
					+ welcomeSpring;			
		} else {
			return "<h1>Hello Human!</h1>" + welcomeSpring;
		}
	}
}