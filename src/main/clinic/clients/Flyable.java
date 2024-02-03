package main.clinic.clients;

public interface Flyable {
    void fly();
    default double getFlySpeed(){
        return 20.0;
    }
}
