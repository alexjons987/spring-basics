package com.example.springbasics.controller;

import com.example.springbasics.service.MathService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    MathService mathService;

    public MathController() {
        this.mathService = new MathService();
    }

    @GetMapping("/product")
    public int getProduct(@RequestParam(defaultValue = "1") Integer x, @RequestParam(defaultValue = "1") Integer y) {
        return mathService.product(x, y);
    }
}
