package com.neuedu.controller;

import com.neuedu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Servlet {
    @RequestMapping("/a.do")
    public String testA(ModelMap map) {
        return "a";
    }

    @RequestMapping("/b.do")
    public ModelAndView testB(String name, String password){
        System.out.println(name +" "+ password);
        ModelMap map = new ModelMap();
        map.put("name",name);
        map.put("password",password);

        return new ModelAndView("b",map);
    }
}
