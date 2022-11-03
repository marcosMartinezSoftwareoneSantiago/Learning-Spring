package com.example.ejerciciocinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/home")
public class HomeController {
    
    @PostMapping
    public String log(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes, Model model){
        if(username.equals("Pepe") && password.equals("12345")){
            model.addAttribute("name",username);
            return "home";
        }else if(username.equals("Pepe")){
            redirectAttributes.addFlashAttribute("username",username);
            return "redirect:/error-usuario";
        }else{
            return "redirect:/error-total";
        }
    }
}
