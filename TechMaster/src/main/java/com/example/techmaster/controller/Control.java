package com.example.techmaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "TechMaster")
public class Control {

    @GetMapping("/course")
    public String getCourse(Model model) {
        return "coursePage.html";
    }

    @GetMapping("/teacher")
    public String teacherPage(){
        return "teacherPage.html";
    }

    @GetMapping("/student")
    public String studentPage(){
        return "studentPage.html";
    }

    @GetMapping("/home")
    public String homePage(){
        return "index.html";
    }

    @GetMapping("/profile")
    public String profilePage() {
        return "profilePage.html";
    }

    @GetMapping("/history")
    public String historyPage() {
        return "historyPage.html";
    }

}
