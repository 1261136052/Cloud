package org.example.admin.controller;

import org.example.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@ResponseBody
public class TestController {
    @Autowired
    UserService UserService;
    @GetMapping("/test")
    public String test(){
        return "hello cloud";
    }

    @GetMapping("/test2")
    public String test2(){
        return UserService.getVal(5L);
    }
}
