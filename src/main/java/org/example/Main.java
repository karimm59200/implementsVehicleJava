package org.example;

import org.example.vehicle.Car;
import org.example.vehicle.Moto;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        Car car1 = new Car();
        Moto moto1 = new Moto();

        car1.accelerate();
        car1.slowDown();
        car1.turnLeft();
        car1.turnRight();

        moto1.accelerate();
        moto1.slowDown();
        moto1.turnLeft();
        moto1.turnRight();

    }
}