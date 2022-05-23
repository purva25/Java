package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Purva Potdukhe");
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		//model.addAttribute("name","Purva Potdukhe");
		ModelAndView model=new ModelAndView();
		model.addObject("name","mansi");
		LocalDateTime now=LocalDateTime.now();
		model.addObject("time",now);
		model.setViewName("help");
		return model;
	}
}
