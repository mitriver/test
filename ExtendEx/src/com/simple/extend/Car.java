package com.simple.extend;

public class Car extends Vehicle {
    protected int wheelcount;

    public Car(String brand, int wheelcount) {
        //super(brand);
        new Vehicle(brand);
        this.wheelcount = wheelcount;
        System.out.println(" 자동차 생성됨");
    }

    public void honk(){
        System.out.println(brand+" 빵빵!");
    }
}
