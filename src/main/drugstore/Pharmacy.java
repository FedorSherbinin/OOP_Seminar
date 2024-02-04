package main.drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private List<Component> pharmacy = new ArrayList<>();
    private int index = 0;



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
        return 0;

    }

}