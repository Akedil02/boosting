package com.example.booting.util;

public class CalculateRequest {
    private int a;
    private int b;


    public CalculateRequest() {
    }

    public CalculateRequest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
