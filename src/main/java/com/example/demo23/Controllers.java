package com.example.demo23;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
    @Autowired
    private  UserService userService;

    @GetMapping("/{name}")
    public String java(@PathVariable String name){
      userService.CreateUser(name);
      return "test api";
    }
}
