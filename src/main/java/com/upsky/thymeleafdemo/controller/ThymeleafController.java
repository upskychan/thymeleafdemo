package com.upsky.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thyleaf")
public class ThymeleafController {
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg","Spring Boot集成Thymeleaf！");
        return "index";
    }
}
