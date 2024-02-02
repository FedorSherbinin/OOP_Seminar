package main.clients;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable{
    public Fish (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Рыбка ест");
    }

    @Override
    public void swim() {
        System.out.println("Рыбка плавает");
    }

    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }

}

