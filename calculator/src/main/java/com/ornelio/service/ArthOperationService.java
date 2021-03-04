package com.ornelio.service;

import org.springframework.stereotype.Service;

@Service
public class ArthOperationService {

    public static double sum(double num1, double num2){
       return num1+num2;
    }
    public static double subtraction(double num1, double num2){
     return num1-num2;
    }

    public static double division(double num1, double num2){
        if(num2==0){
            throw new IllegalArgumentException(" the dividend must be different than 0");
        }
        return num1/num2;
    }

    public static double multiplication(double num1, double num2){
        return num1*num2;
    }
}
