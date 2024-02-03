package main.clinic.clients;

@FunctionalInterface
public interface Goable {
//    public static final double pi = 3.14; // public static final писать не нужно.
//    public static final List<Illness> pi = new ArrayList<>();
    void run();
    default double getRunSpeed(){
        return 10;
    }
}