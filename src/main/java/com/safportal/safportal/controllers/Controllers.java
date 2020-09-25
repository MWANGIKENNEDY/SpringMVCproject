package com.safportal.safportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @GetMapping(value = "/index")
    String indexPage(){
        return "index";
    }
}
