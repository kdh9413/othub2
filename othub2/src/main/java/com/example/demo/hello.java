package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hello {

	@RequestMapping("hello")
	public ModelAndView test() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}
}
