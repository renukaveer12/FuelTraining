package com.example.DemoMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/sayhello")
	public String greeting(@RequestParam(name="name",required=false,defaultValue ="DIMES")String fname,org.springframework.ui.Model Model) {
		Model.addAttribute("collegename",fname);
		return "hello";
	}

}
