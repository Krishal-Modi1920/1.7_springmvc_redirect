// Contact Controller -> Service Class -> Database Layer(UserDao) -> Database
package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    
    @ModelAttribute
    public void commonDataForModel(Model m) {
        System.out.println("Adding common data to model");
        m.addAttribute("Header", "Krishal Form");
        m.addAttribute("Desc", "This is the home for learners");
    }
    
    
    

    @RequestMapping("/contact")
    public String showForm(Model m) {
        System.out.println("Showing contact form");
        return "contact"; // Ensure this JSP exists in /WEB-INF/views/
    }




    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model) {
        System.out.println("Processing form: " + user);
        
        if(user.getUserName().isBlank()) {
        	return "redirect:/contact";
        }
        
        // Save the user to the database
        int createdUser = userService.createUser(user);
        model.addAttribute("message", "User registered successfully with ID: " + createdUser);
        model.addAttribute("msg", "User created with id " + createdUser);
        return "success"; // Ensure this JSP exists in /WEB-INF/views/
    }
}

















/* Working Code 1
 * 
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) // Be
 * default method is GET public String handleForm(
 * 
 * @RequestParam(name = "email", required = false) String userEmail,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String userPassword, Model model) { // String
 * Variable // Method 1
 * 
 * // Method 2 User user = new User(); user.setEmail(userEmail);
 * user.setUserName(userName); user.setPassword(userPassword);
 * System.out.println(user);
 * 
 * 
 * // // Fetching in success.jsp // model.addAttribute("email", userEmail); //
 * model.addAttribute("name", userName); // model.addAttribute("password",
 * userPassword);
 * 
 * model.addAttribute("user", user); return "success"; }
 */
























/*
 * Working Code 2 package springmvc.controller;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import springmvc.model.User;
 * 
 * @Controller public class ContactController {
 * 
 * @RequestMapping("/contact") public String showForm() { return "contact"; //
 * Ensure the view name matches the JSP file name }
 * 
 * // Method 3
 * 
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) // Be
 * default method is GET public String handleForm(@ModelAttribute User user,
 * Model model) {
 * 
 * 
 * 
 * return "success"; } }
 */

