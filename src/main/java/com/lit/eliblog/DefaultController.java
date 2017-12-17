package com.lit.eliblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@Autowired
	//DataLoader dl = new DataLoader(postRepo);
	
	@RequestMapping("/")
	String returnRoot(Model m) {
		//m.addAttribute("posts",  );
		return "index";
		
	}

}
