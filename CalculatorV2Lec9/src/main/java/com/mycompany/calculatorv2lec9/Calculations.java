package com.mycompany.calculatorv2lec9;

public class Calculations {

    private final int num1;
    int num2;

    public Calculations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getAddition() {
        return num1 + num2;
    }

    public int getSubtraction() {
        return num1 - num2;
    }

    public int getMultiply() {
        return num1 * num2;
    }

    public int getDivision() {
        return num1 / num2;
    }
}
