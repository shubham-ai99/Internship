package com.example.project1;


import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/project1")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
