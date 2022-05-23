package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showform() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	/*public String handleform(Model model,@RequestParam("uname") String name, @RequestParam("age") int age, @RequestParam("city") String city) {
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("city",city);
		
		return "display";
	}*/
	public ModelAndView handleform(@RequestParam("uname") String name, @RequestParam("age") int age, @RequestParam("city") String city) {
		ModelAndView model=new ModelAndView();
		model.addObject("name",name);
		model.addObject("age",age);
		model.addObject("city",city);
		model.setViewName("display");
		
		return model;
		
	}
}
