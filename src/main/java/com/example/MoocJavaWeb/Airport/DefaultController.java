package com.example.MoocJavaWeb.Airport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("*")
    public String handleDefault(){
        return "menu";
    }
}
