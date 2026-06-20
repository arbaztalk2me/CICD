package com.jenkins.jenkinsCiCd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("Testing done", HttpStatus.OK);
    }


    @GetMapping("/umrah")
    public ResponseEntity<String> umrah(){
        return new ResponseEntity<>("hey baebs i love you baby", HttpStatus.OK);
    }
    
}
