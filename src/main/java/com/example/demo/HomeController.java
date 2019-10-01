package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("Student", new Student());
        return "songform";

    }
    @PostMapping("/songform")
    public String loadFormPage(@ModelAttribute Student student, Model model){
        model.addAttribute("Student", student);
        return "confirmsong";
    }
}
