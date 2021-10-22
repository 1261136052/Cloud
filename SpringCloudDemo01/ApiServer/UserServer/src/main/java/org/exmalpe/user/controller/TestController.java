package org.exmalpe.user.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@ResponseBody
public class TestController {
    @GetMapping("/test/{id}")
    public String test(@PathVariable long id){
        return "hello cloud - user - center:"+id;
    }
}
