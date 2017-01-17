package com.mrvelibor.websistemi2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VeliborController {
	@RequestMapping("/pozdrav")
	public ModelAndView helloWorld() {
		return new ModelAndView("pozdrav", "poruka", "Pozdrav za tebe!");
	}
}
