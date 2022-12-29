package com.example.techmaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class control {

    @GetMapping("/TechMaster")
    public String Spring(Model model) {
        return "index.html";
    }
}
