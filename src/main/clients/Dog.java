package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    public Dog() {
        super();
    }

    public void fly() {
        System.out.println(nickName + "не умею");
    }

    @Override
    public void toGo() {
        System.out.println("Животное бегает");
    }

    @Override
    public void swim() {
        System.out.println(nickName + "не умею");
    }
}