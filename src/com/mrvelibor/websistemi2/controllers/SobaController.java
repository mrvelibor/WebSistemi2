package com.mrvelibor.websistemi2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mrvelibor.websistemi2.dao.SobaDao;
import com.mrvelibor.websistemi2.model.Soba;

@Controller
public class SobaController {

	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private SobaDao sobaDao;

   @RequestMapping(value = "/soba", method = RequestMethod.GET)
   public ModelAndView soba() {
      return new ModelAndView("novaSoba", "command", new Soba());
   }
   
   @RequestMapping(value = "/addSoba", method = RequestMethod.POST)
   public String addSoba(@ModelAttribute("SpringWeb") Soba soba, ModelMap model) {
	      model.addAttribute("brojKreveta", soba.getBrojKreveta());
	      model.addAttribute("velicina", soba.getVelicina());
	      model.addAttribute("kupatilo", soba.getKupatilo());
	      model.addAttribute("tv", soba.getTv());
	      model.addAttribute("klima", soba.getKlima());
	      model.addAttribute("cenaPoDanu", soba.getCenaPoDanu());
	      sobaDao.addSoba(soba);
      return "soba";
   }
}