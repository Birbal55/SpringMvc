package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
//	public String one() {//1st way for redirecting
//		System.out.println("This is one handler");
//		return "redirect:/enjoy";
//	}
	//2nd way for redirecting
	public RedirectView one() {//1st way for redirecting
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is second handler");
		return "contact";
	}
}
