package com.example.MoocJavaWeb.HelloList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloListController {

    private List<String> list;

    public HelloListController(){
        this.list = new ArrayList<>();
        this.list.add("Hello");
        this.list.add("+[-[<<[+[--->]-[<<<]]]>>>-]>-.---.>..>.<<<<-.<+.>>>>>.>.<<.<-.");
    }
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("list", list);
        return "index";
    }
    @PostMapping("/")
    public String addContent(@RequestParam String content){
        this.list.add(content.trim());
        return "redirected:/";
    }

}
