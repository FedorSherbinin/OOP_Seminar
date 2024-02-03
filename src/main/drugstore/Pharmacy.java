package main.drugstore;

public class Pharmacy implements Comparable<Pharmacy>{
    private String name;
    private int price;

    public Pharmacy(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.price, o.price);
    }

    public static int compareByName(Pharmacy p1, Pharmacy p2){
        return p1.name.compareTo(p2.name);
    }

}
