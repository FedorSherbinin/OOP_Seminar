package main.drugstore;

import java.util.Collections;
import java.util.List;

public abstract class Component implements Comparable<Component> {
    String title;
    public Double weight;
    private int power;

    public Component(String title, Double weight, int power) { //alt + Ins
        this.title = title;
        this.weight = weight;
        this.power = power;
    }


    @Override
    public String toString() {
        return String.format("Title = %s, weight = %s, power = %s", title, weight, power);
    }

    @Override
    public int compareTo(Component o) {
////        return this.power - o.power;
//
        return Integer.compare(this.power, o.power);
//        return Double.compare(this.weight, o.weight);
//
//
//        if (this.power > o.power) {
//            return 1;
//        }
//        else if (this.power < o.power){
//            return -1;
//        }
//        else return 0;
//
//
    }

}
