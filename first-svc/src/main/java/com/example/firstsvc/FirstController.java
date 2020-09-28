package com.example.firstsvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * sdasdfasdf
 */
@RestController
@RequestMapping("employee")
public class FirstController {
    @GetMapping("/message")
    public String test() {
        return "This is fist appliation (employee)";
    }
}
