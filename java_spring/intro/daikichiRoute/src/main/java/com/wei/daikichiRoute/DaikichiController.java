package com.wei.daikichiRoute;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{country}")
	public String travelCountry(
			@PathVariable("country") String country
			) 
	{
		return "Congratulations! You will sonn travle to " + country +"!";
		
	}
	
	@RequestMapping("/lotto/{signOfNumber}")
	public String signOfNumber(
			@PathVariable("signOfNumber") String number
			)
	{
		int signOfNum = Integer.parseInt(number);
		if (signOfNum % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers'";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
