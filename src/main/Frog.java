package main;

import java.time.LocalDate;

public class Frog extends Animal{
    public Frog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public void fly() {
        System.out.println(nickName + "не умею");
    }

    @Override
    public void toGo() {
        System.out.println(nickName + "очень плохо");
    }

    @Override
    public void swim() {
        System.out.println(nickName + "плавает");
    }
}
