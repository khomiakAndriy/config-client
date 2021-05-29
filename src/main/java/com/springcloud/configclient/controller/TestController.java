package com.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${some-property}")
    private String propertyValue;

    @GetMapping("/test")
    public ResponseEntity<String> test() {

        return ResponseEntity.ok(propertyValue);
    }
}
