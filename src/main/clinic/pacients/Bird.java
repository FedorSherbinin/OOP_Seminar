package main.clinic.pacients;

import main.clinic.clients.Animal;
import main.clinic.clients.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Птичка ест");
    }

    @Override
    public void fly() {
        System.out.println("Птичка летает");
    }

    @Override
    public double getFlySpeed() {
        return Flyable.super.getFlySpeed();
    }
}
