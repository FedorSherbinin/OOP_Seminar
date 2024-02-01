package main.clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void eat() {
        System.out.println("Рыбка ест");
    }

    public Fish(){
        super();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void fly() {
        super.fly();
    }
}

