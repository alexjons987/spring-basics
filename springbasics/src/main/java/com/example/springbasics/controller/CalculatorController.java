package com.example.springbasics.controller;

import com.example.springbasics.model.Calculations;
import com.example.springbasics.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    CalculatorService calculatorService;

    public CalculatorController() {
        this.calculatorService = new CalculatorService();
    }

    @GetMapping("/calc/add")
    public int addition(@RequestParam(defaultValue = "0") Integer x, @RequestParam(defaultValue = "0") Integer y) {
        return calculatorService.add(x, y);
    }

    @GetMapping("/calc/sub")
    public int subtraction(@RequestParam(defaultValue = "0") Integer x, @RequestParam(defaultValue = "0") Integer y) {
        return calculatorService.sub(x, y);
    }

    @GetMapping("/calc/mul")
    public int multiplication(@RequestParam(defaultValue = "1") Integer x, @RequestParam(defaultValue = "1") Integer y) {
        return calculatorService.mul(x, y);
    }

    @GetMapping("/calc/div")
    public ResponseEntity<?> division(@RequestParam Integer x, @RequestParam Integer y) {
        if (y == 0) {
            return ResponseEntity.badRequest().body("Error: Cannot divide by 0!");
        }

        float res = calculatorService.div(x, y);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/calc/all")
    public ResponseEntity<?> all(@RequestParam Integer x, @RequestParam Integer y) {
        if (y == 0) {
            return ResponseEntity.badRequest().body("Error: y cannot be zero! Cannot divide by 0!");
        }

        Calculations res = new Calculations(x, y);
        return ResponseEntity.ok(res);
    }
}
