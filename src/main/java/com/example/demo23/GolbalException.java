package com.example.demo23;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GolbalException  {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> responseEntity(Exception e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Arun");
    }
}
