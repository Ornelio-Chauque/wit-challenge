package com.ornelio;

import com.ornelio.service.ArthOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.Clock;

@RestController
@RequestMapping("/app")
public class OperationController {

    @Autowired
    ArthOperationService operationService;

    @GetMapping("/sum")
    public ResponseData sum(@RequestParam(value = "num1", defaultValue = "0")double  num1, @RequestParam(value = "num2", defaultValue = "0") double num2){
        ResponseData responseData= new ResponseData(operationService.sum(num1,num2));
        return responseData;
    }

    @GetMapping("/sub")
    public ResponseData sub(@RequestParam(value = "num1", defaultValue = "0") double num1,
                   @RequestParam(value = "num2", defaultValue = "0") double num2){
        ResponseData responseData= new ResponseData(operationService.subtraction(num1,num2));
        return responseData;
    }

    @GetMapping("/div")
    public ResponseData div(@RequestParam(value = "num1", defaultValue = "0") double num1,
                   @RequestParam(value = "num2", defaultValue = "1") double num2){
        ResponseData responseData= new ResponseData(operationService.division(num1,num2));
        return responseData;
    }

    @GetMapping("/mult")
    public ResponseData mult(@RequestParam(value = "num1", defaultValue = "0") double num1,
                    @RequestParam(value = "num2", defaultValue = "0") double num2){
        ResponseData responseData= new ResponseData(operationService.multiplication(num1,num2));
        return responseData;
    }

}
