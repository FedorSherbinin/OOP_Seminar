package main.drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private List<Component> pharmacy = new ArrayList<Component>();
    private int index = 0;
    private Double weight;
    private String title;


    public void addComponents(Component ... components) {
        for(Component c : components){
            this.pharmacy.add(c);
        }

    }

    @Override
    public boolean hasNext() {
        return index < pharmacy.size();
    }

    @Override
    public Component next() {
        return (Component) pharmacy;
    }

    @Override
    public int compareTo(Pharmacy o) {
        return this.weight.compareTo(o.weight);

    }

    public static void sortBy(List<Component> pharmacies) {
        Collections.sort(pharmacies, (b1, b2) -> CharSequence.compare(b1.title, b2.title));
    }

}