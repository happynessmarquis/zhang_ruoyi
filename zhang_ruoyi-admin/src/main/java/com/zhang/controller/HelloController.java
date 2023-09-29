package com.zhang.controller;

import com.zhang.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhang
 */
@Controller
public class HelloController {

    @GetMapping("index")
    public String toIndex(Model model) {
        model.addAttribute("name", "张嘉文");
        return "index";
    }

    @GetMapping("hello")
    public String SayHello(Model model) {
        model.addAttribute("name", "张嘉文");
        return "login";
    }

    @GetMapping("expression")
    public String expressionStudy(Model model) {
        User user01 = new User();
        user01.setName("崔林格");
        user01.setAge(35);
        user01.setAddress("青年路");
        model.addAttribute("user", user01);
        return "expression";
    }

    @GetMapping("/i18n")
    public String localeControllerMethod(Model model) {
        return "login";
    }
}
