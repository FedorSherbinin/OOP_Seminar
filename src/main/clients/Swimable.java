package main.clients;

public interface Swimable {
    void swim();

    default double getSwimSpeed(){
        return 15.0;
    }
}