package com.tyb.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("/hello")
    public ResponseEntity greeting(){
        return ResponseEntity.ok("Hello!");
    }

    @GetMapping("/testing")
    public ResponseEntity testMethod(){
        return ResponseEntity.ok("this is test method");
    }

    @GetMapping("/demo")
    public ResponseEntity demo(){
        return ResponseEntity.ok("demo method");
    }
}
