package com.example.MoocJavaWeb.HelloObjects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloObjectsController {
    private List<Item> items;

    public HelloObjectsController(){
        this.items = new ArrayList<>();
        this.items.add(new Item("Wizard hat", "pointy"));
        this.items.add(new Item("Party hat", "groovy"));
    }
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("list", items);
        return "index1";
    }
    @PostMapping("/")
    public String post(@RequestParam String name, @RequestParam String type) {
        this.items.add(new Item(name.trim(),type.trim()));
        return "redirect:/";
    }
}
