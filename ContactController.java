package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";
	}

	@RequestMapping(value = "/processfrom", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String Useremail, @RequestParam("Name") String userName,
			@RequestParam("Password") String userPassword,Model model) {

		System.out.println("User Email" + Useremail);
		System.out.println("User Name" + userName);
		System.out.println("User Password" + userPassword);
		
		model.addAttribute("email",Useremail);
		model.addAttribute("name",userName);
		model.addAttribute("password",userPassword);
		
		return "success";

	}
}
