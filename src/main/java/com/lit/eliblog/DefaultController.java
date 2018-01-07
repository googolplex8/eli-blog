package com.lit.eliblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@Autowired
	DataLoader dl;
	
	@RequestMapping("/")
	String returnRoot(Model m) {
		m.addAttribute("text_injection", dl.postReturner() );
		return "index";
	}
}
