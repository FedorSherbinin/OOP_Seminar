package main.clinic.pacients;

import main.clinic.clients.Animal;
import main.clinic.clients.Goable;
import main.clinic.clients.Illness;
import main.clinic.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {

    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    @Override
    public void run() {
        System.out.println("Кошка бегает");
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и ест");
    }

    public static void meow() {
        System.out.println("Мяяяу!");
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + "Discount(" + discount + ")";
    }
}