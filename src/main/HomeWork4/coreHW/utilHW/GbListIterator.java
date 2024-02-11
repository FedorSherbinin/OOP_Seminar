package main.HomeWork4.coreHW.utilHW;

import main.HomeWork4.coreHW.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GbListIterator<T> implements Iterator<T> {
    private Node<T> head;
    private T data;

    private Node<T> current = head;

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        T data = current.data;
        current = current.next;
        return data;
    }
}
