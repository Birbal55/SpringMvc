package springmvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;  

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Birbal Kumar");
		model.addAttribute("id",1221);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandan");
		friends.add("Roshni");
		friends.add("ABC");
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	
	//services
	//help
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Uttam");
		modelAndView.addObject("rollnumber",123654);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(1122);
		list.add(1256);
		list.add(1512);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
