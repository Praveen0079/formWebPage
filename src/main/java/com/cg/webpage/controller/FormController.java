package com.cg.webpage.controller;


import com.cg.webpage.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class FormController {

    @ModelAttribute("user")
    public User setUpUser() {
        return new User();
    }

    @GetMapping("/")
    public String showpage1(Model model) {
        return "page1";
    }

    @PostMapping("/page2")
    public String processpage1(@ModelAttribute("user") User user) {
        return "page2";
    }

    @PostMapping("/page3")
    public String processpage2(@ModelAttribute("user") User user) {
        return "page3";
    }

    @PostMapping("/submit")
    public String processpage3(@ModelAttribute("user") User user) {
        return "page4";
    }
}
