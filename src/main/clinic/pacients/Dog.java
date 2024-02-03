package main.clinic.pacients;

import main.clinic.clients.*;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void run() {
        System.out.println("Собака бегает");
    }

    @Override
    public void swim() {
        System.out.println("Собака плавает но не как рыба");
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}