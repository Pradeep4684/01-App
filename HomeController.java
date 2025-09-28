package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home page");
		model.addAttribute("name","Pradeep Andhale");
		model.addAttribute("num",7);
		List<String> friend = new ArrayList<String>();
		friend.add("Shubhangi");
		friend.add("Soham");
		friend.add("Pradeep");
		
		model.addAttribute("f",friend);
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
	
	@RequestMapping("/Services")
	public String services() {
		System.out.println("this is Services page");
		return "services";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		//Creting Model & View Object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Shubhangi");
		modelAndView.addObject("RollNumber",77);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time" , now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(70);
		
		modelAndView.addObject("marks",list);
		
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}
