package com.zhang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String SayHello() {
        return "Hello World";
    }
}
