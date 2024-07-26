package com.example.demo23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void CreateUser (String name){
        System.out.println("Created name"+ name);
    }
}
