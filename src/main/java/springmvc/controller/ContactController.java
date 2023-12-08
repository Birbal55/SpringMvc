package springmvc.controller;
import springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller("/contact")
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","LearnCodeWithBirbal");
		m.addAttribute("Description","Home for Programmer");
		
	}
	@RequestMapping
	public String showForm(Model m) {
		return "contact";
	}
	
	/*
	// 1st way
	@RequestMapping(value = "/processform",method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword,
			Model model) {

//		System.out.println("user email "+ userEmail);
//		System.out.println("user name "+ userName);
//		System.out.println("user password "+ userPassword);
//		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		//process
//		model.addAttribute("name",userName);
//		model.addAttribute("email",userEmail);
//		model.addAttribute("password",userPassword);
		
		model.addAttribute("user",user);
		return "suceess";
	}
	*/
	
	//2nd way
	@RequestMapping(value = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		//process
		
//		model.addAttribute("Header","LearnCodeWithBirbal");
//		model.addAttribute("Description","Home for Programmer");
//		
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg","User created with id " +createdUser);
		return "suceess";
	}
}
