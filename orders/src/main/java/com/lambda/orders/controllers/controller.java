package com.lambda.orders.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller
{
    @GetMapping(value="/test")
    public ResponseEntity<?> doTesting()
    {
        return new ResponseEntity<>("Its All Good", HttpStatus.OK);
    }
}
