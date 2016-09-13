package tiy.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class SampleSpringAppController {
    @RequestMapping(path = "/person-url", method = RequestMethod.GET) //maps to URL
    public String person(Model model, String name, String city, int age) { //this person name doesn't matter
        Person p = new Person(name, city, age);
        model.addAttribute("person-object", p); //person object - change this in template also to person object
        return "person-view"; //name of the model that we want to use with our contoller
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, HttpSession session) {
        model.addAttribute("name", session.getAttribute("userName"));
        return "home";
    }
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, String userName) {
        session.setAttribute("userName", userName);
        return "redirect:/";
    }
    @RequestMapping(path = "/logout", method = RequestMethod.GET)
    public String logout(Model model, HttpSession session) {
        session.removeAttribute("userName");
        return "redirect:/";
    }

}
