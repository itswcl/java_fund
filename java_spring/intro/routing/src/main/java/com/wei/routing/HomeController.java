package com.wei.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

//public class HomeController {
//	@RequestMapping("/greeting")
//	public String index() {
//		return "Hello User!";
//	}
//	
//	@RequestMapping(value="/greeting/hell", method=RequestMethod.GET)
//	public String hello() {
//		return "Hello world! What route did you use to access me?";
//	}
//	
//	@RequestMapping("/greeting/goodbye")
//	public String world() {
//		return "GoodBye";
//	}
//}

@RequestMapping("/greeting")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "Hello User!";
	}
	
	@RequestMapping(value="/hell", method=RequestMethod.GET)
	public String hello() {
		return "Hello world! What route did you use to access me?";
	}
	
	@RequestMapping("/goodbye")
	public String world() {
		return "GoodBye";
	}
}
