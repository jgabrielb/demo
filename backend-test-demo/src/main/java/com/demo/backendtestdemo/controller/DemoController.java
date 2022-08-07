package com.demo.backendtestdemo.controller;

import com.demo.backendtestdemo.model.CustomResponse;
import com.demo.backendtestdemo.model.Matrices;
import com.demo.backendtestdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService service;

    @PostMapping(value = "/invertirMatriz", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_PROBLEM_JSON_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_PROBLEM_JSON_VALUE })
    public CustomResponse invertirMatriz(@RequestBody Matrices m){
        return service.invertirMatriz(m);
    }

}
