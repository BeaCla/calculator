package com.example.calculator.Controller;

import com.example.calculator.NumberService.NumberService;
import com.example.calculator.Rounding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.channels.ReadPendingException;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    NumberService numberService;

    @GetMapping("/addition")
    public ResponseEntity addition (@RequestParam double firstNumber, @RequestParam double secondNumber, @RequestParam Rounding rounding) {
        double result = numberService.addition(firstNumber,secondNumber, rounding);
        return new ResponseEntity("calculate addition, result: " + result, HttpStatus.OK);
    }

    @GetMapping("/subtraction")
    public ResponseEntity subtraction (@RequestParam double firstNumber, @RequestParam double secondNumber, @RequestParam Rounding rounding) {
        double result = numberService.subtract(firstNumber,secondNumber, rounding);
        return new ResponseEntity("Calculate subtraction, result: " + result, HttpStatus.OK);
    }

    @GetMapping("/multiply")
    public ResponseEntity multiply (@RequestParam double firstNumber, @RequestParam double secondNumber, @RequestParam Rounding rounding) {
        double result = numberService.multiply(firstNumber,secondNumber, rounding);
        return new ResponseEntity("Calculate multiplication, result: " + result, HttpStatus.OK);
    }

    @GetMapping("/division")
    public ResponseEntity division (@RequestParam double firstNumber, @RequestParam double secondNumber, @RequestParam Rounding rounding) {
        double result = numberService.divide(firstNumber,secondNumber, rounding);
        return new ResponseEntity("Calculate division, result: " + result, HttpStatus.OK);
    }

    @GetMapping("/max")
    public ResponseEntity max (@RequestParam double firstNumber, @RequestParam double secondNumber, @RequestParam Rounding rounding) {
        double result = numberService.max(firstNumber, secondNumber, rounding);
        return new ResponseEntity("Calculate max, result: " + result, HttpStatus.OK);
    }

    @GetMapping("/min")
    public ResponseEntity min (@RequestParam double firstNumber, @RequestParam double secondNumber, @RequestParam Rounding rounding) {
        double result = numberService.min(firstNumber, secondNumber, rounding);
        return new ResponseEntity("Calculate min, result: " + result, HttpStatus.OK);
    }

    @GetMapping("/mod")
    public ResponseEntity mod (@RequestParam double firstNumber, @RequestParam double secondNumber, @RequestParam Rounding rounding) {
        double result = numberService.mod(firstNumber, secondNumber, rounding);
        return new ResponseEntity("Calculate modulus, result: " + result, HttpStatus.OK);
    }

}
