package org.example.vehicle;

public class Moto implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("je suis une moto et je peux atteindre les 100km/h eb moins de 3 secondes.");
    }

    @Override
    public void slowDown() {
        System.out.println("En cas de freinage d'urgence une moto parcourt 3 mètres de plus qu'une voiture à 50 km/h et 9 mètres de plus à 80 km/h.");
    }

    @Override
    public void turnLeft() {
        System.out.println("je suis une moto et je tourne à gauche.");
    }

    @Override
    public void turnRight() {
        System.out.println("je suis une moto et je tourne à droite.");
    }

    
}
