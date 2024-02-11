package main.list.core;

public interface GBList<T> extends Iterable<T> {
    void add(T element);
    void remove(int index);
    T get(int index);
    int size();

}
