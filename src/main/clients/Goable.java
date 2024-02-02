package main.clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable {
//    public static final double pi = 3.14; // public static final писать не нужно.
//    public static final List<Illness> pi = new ArrayList<>();
    void run();
    default double getRunSpeed(){
        return 10;
    }
}