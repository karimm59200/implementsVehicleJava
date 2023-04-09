package org.example.vehicle;

public class Car  implements Vehicle{

    @Override
    public void accelerate() {
        System.out.println(" je suis une voiture et je passe de 0 à 100 km/h en 5 secondes.");
    }

    @Override
    public void slowDown() {
        System.out.println(" je suis une voiture est ma décélaration est de : (vitesse/10)² sur sol sec. ");
    }

    @Override
    public void turnLeft() {
        System.out.println("je suis une voiture et je tourne à gauche. ");

    }

    @Override
    public void turnRight() {
        System.out.println("je suis une voiture et je  tourne à droite.");

    }




}
