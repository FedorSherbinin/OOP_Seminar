package main;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Fish(){
        super();
    }

    @Override
    public void toGo() {
        super.toGo();
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

