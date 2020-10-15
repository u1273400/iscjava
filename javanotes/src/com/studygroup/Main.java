package com.studygroup;

public class Main {

    public static void main(String[] args) {
        float x = 5;
        float degF = degF(x);
        System.out.println((x ) + " degC =  " + (degF) + " degF");
    }
    public static float degF(float x) {
        float degF = 9/5*x+32;
        return degF;
    }
}
