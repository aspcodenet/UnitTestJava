package se.systementor.unittest.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("age", 18);
        model.addAttribute("location", "K");
        model.addAttribute("promille", 0.0);
        return "home";
    }


    @PostMapping("/")
    String homePost(Model model, int age, String location, float promille ) {
        model.addAttribute("age", age);
        model.addAttribute("location", location);
        model.addAttribute("promille", promille);




        return "home";
    }

}
