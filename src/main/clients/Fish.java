package main.clients;

public class Fish extends Animal implements Swimable{
    public Fish () {
        super();
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

