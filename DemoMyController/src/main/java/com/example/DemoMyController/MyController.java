package com.example.DemoMyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private StudentRepository stud;
	@GetMapping("/student")
	public List<Student>getAllStudent()
	{
		return stud.findAll();
	}

}
