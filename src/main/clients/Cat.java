package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {

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
    public void toGo() {
        System.out.println("Животное бегает");
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