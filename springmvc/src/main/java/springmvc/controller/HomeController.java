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

	// Using Model
	@RequestMapping("/")
    public String defaultPage(Model model) {
		model.addAttribute("name", "Krishal Modi"); // key, value
		model.addAttribute("id", 171);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Krishal");
		friends.add("Rahul");
		friends.add("Kalp");
		friends.add("Devendra");
		friends.add("Romil");
		
		model.addAttribute("f", friends);
		
        return "index";
    }
    
    
    @RequestMapping("/about")
    public String about() {
        return "about";
    }
    
    
    // Using ModelAndView
    @RequestMapping("/help")
    public ModelAndView help() {
    	System.out.println("This is help Controller");
    	ModelAndView modelAndView = new ModelAndView();
    	// Setting the Data
    	modelAndView.addObject("name", "Krishal");
    	modelAndView.addObject("rollnumber", 171);
    	LocalDateTime now = LocalDateTime.now();
    	modelAndView.addObject("time", now);
    	
    	// Marks
    	
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(12);
    	list.add(1325);
    	list.add(452);
    	list.add(171);
    	
    	modelAndView.addObject("marks", list);
    	
    	
    	// Setting the view name
    	modelAndView.setViewName("help");
    	
    	return modelAndView;
    }
    
    
}
