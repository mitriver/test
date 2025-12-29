package com.simple.ex;

interface Flyable {
    void fly();
}

class Airpalane implements Flyable{

    @Override
    public void fly() {
        System.out.println(" 비행기는 젯트 엔진을 이용하여 하늘을 납니다.");
    }
}


class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println(" 새는 날개을 이용하여 하늘을 날아 다닌다.");
    }
}

class Drone implements Flyable {
    @Override
    public void fly() {
        System.out.println(" 드론은 프로펠러로 공중을 날아다닙니다.");
    }
}

public class FlyTest {
    public static void main(String[] args) {
//       Airpalane airpalane = new Airpalane();
//       airpalane.fly();

        Flyable[] items = {
                new Airpalane(),
                new Bird(),
                new Drone(),
        };

        for (Flyable f : items){
            f.fly();  // 다형성
        }


    }
}


