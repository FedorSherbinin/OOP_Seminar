package main.LinkedList_HomeWork4.core_HW.util_HW;

import main.LinkedList_HomeWork4.core_HW.Node;

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
