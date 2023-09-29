package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinkController {
    @GetMapping("/link/test")
    public String toLink(Model model) {
        model.addAttribute("myName", "zhangsan");
        return "link";
    }
}
