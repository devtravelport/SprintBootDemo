package demo.first.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Rest Controller in Spring
public class CourseApiController {
	
	@RequestMapping("/courses") //this way of mapping is only for Get
	public String getCourses() {
		return "your list of courses";
	}
int age;


char smooch = 'x';

}
