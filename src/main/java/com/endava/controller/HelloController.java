package com.endava.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vcerbu on 4/25/2017.
 */
@Controller

public class HelloController {
    @RequestMapping(value = "/")
    public String home() {
        return "HelloController";
    }
}
