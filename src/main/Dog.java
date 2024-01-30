package main;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    public void fly() {
        System.out.println(nickName + "не умею");
    }

    @Override
    public void toGo() {
        System.out.println(nickName + "бегает");
    }

    @Override
    public void swim() {
        System.out.println(nickName + "не умею");
    }
}