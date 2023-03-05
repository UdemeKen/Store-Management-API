package com.store_Mgt_System.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SignupController {

    @GetMapping("signup")
    public String Signup(){
        return "Signup Successful";
    }
}
//echo "# Store-Management-API" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M Techub
//        git remote add origin https://github.com/UdemeKen/Store-Management-API.git
//        git push -u origin Techub