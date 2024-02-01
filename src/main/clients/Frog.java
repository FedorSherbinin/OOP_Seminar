package main.clients;

import java.time.LocalDate;

public class Frog extends Animal{
    public Frog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Лягушка ест");
    }

    public void fly() {
        System.out.println(nickName + "не умею");
    }

    @Override
    public void swim() {
        System.out.println(nickName + "плавает");
    }
}
