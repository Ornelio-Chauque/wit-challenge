package com.ornelio;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class ResponseData {
    private double result;

    public ResponseData(double result){
        this.result=result;
    }

    public double getResult() {
        return result;
    }

    public void ResponseData(double result) {
        this.result = result;
    }

}
