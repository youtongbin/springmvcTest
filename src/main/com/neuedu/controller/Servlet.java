package com.neuedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Servlet {
    @RequestMapping("/a.do")
    public String test() {
        return "a";
    }
}
