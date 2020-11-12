package com.example.calculator.NumberService;

import com.example.calculator.Rounding;
import org.springframework.stereotype.Component;

@Component
public class NumberService {

    public double addition(double firstNumber, double secondNumber, Rounding rounding) {
        double result = firstNumber + secondNumber;
        return rounding(result, rounding);
    }

    public double subtract(double firstNumber, double secondNumber, Rounding rounding) {
        double result = firstNumber - secondNumber;
        return rounding(result, rounding);
    }

    public double multiply(double firstNumber, double secondNumber, Rounding rounding) {
        double result = firstNumber * secondNumber;
        return rounding(result, rounding);
    }

    public double divide(double firstNumber, double secondNumber, Rounding rounding) {
        double result = firstNumber / secondNumber;
        return rounding(result, rounding);
    }

    public double max(double firstNumber, double secondNumber, Rounding rounding) {
        double result = Math.max(firstNumber, secondNumber);
        return rounding(result, rounding);
    }

    public double min(double firstNumber, double secondNumber, Rounding rounding) {
       double result = Math.min(firstNumber, secondNumber);
        return rounding(result, rounding);
    }

    public double mod(double firstNumber, double secondNumber, Rounding rounding) {
        double result = firstNumber %  secondNumber;
        return rounding(result, rounding);
    }

    public double rounding(double value, Rounding rounding) {
        switch (rounding) {
            case CEIL: return Math.ceil(value);
            case FLOOR: return Math.floor(value);
            case ROUND: return Math.round(value);
            case NOTHING: default: return value;
        }
    }

}
