package com.jerome.example_19.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // entering multiple paths to access the home page
    @GetMapping(value = {"", "/", "/home"})
    // Model object is used to pass data from the controller to the view
    public String displayHomePage(Model model){
        // Adds a key-value pair to the model making username accessible to the view
        model.addAttribute("username", "ynacakes");
        return "home.html";
    }
}
