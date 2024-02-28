package kz.aitu.spring_university_management_system.controllers;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user_table")
public class UserController {
    @GetMapping("hello")
    public String sayHello(){
        return "Hello world!";
    }
}
