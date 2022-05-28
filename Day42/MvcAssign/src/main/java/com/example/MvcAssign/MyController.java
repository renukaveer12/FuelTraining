package com.example.MvcAssign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@Autowired
	UsersRepository userrepo;
	@PostMapping("/createuser")
	public String createuser(@ModelAttribute Users user) {
		userrepo.save(user);
		return"index";
		
	}
	@GetMapping("/showall")
	public String show(Model model) {
		List<Users> user=userrepo.findAll();
		model.addAttribute("users",user);
		return "result";
	}

}
