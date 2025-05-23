package se.systementor.unittest.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import se.systementor.unittest.services.BeerCalculatorService;

@Controller
public class HomeController {

    @Autowired
    private BeerCalculatorService beerCalculatorService;

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

        boolean canBuyBeer = beerCalculatorService.CanBuyBeer(age, location, promille);
        String Result = "No";
        if(canBuyBeer){
            Result = "Yes";
        }
        model.addAttribute("Result", Result);

        return "home";
    }

}
