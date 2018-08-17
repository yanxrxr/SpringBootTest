package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
    @RequestMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "I'm the message");
        return "Test";
    }
}
