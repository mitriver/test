package com.simple.staticex;
class UnitConverter {
    // cm -> m
    public static double cmtometer(double cm) {
         return cm/100.0;
    }
}


public class UnitTest {
    public static void main(String[] args) {

        UnitConverter.cmtometer(214.1);

        Math.random();

    }
}
