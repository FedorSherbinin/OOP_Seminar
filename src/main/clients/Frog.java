package main.clients;

public class Frog extends Animal implements Swimable, Goable{
    public Frog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Лягушка ест");
    }

    @Override
    public void swim() {
        System.out.println("Лягушка плывет");
    }

    @Override
    public void run() {
        System.out.println("Лягушка ходит");
    }

    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }

}
