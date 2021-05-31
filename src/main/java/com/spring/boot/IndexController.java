package com.spring.boot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/result")
	public String index(@RequestParam("val") String data, Model model) {
		System.out.println("data : --- "+data);			
		model.addAttribute("value", data);		
		return "result";
	}

}
