package main.LinkedList_HomeWork4.core_HW.lists_HW;

import main.LinkedList_HomeWork4.core_HW.Node;
import main.LinkedList_HomeWork4.core_HW.util_HW.GbListIterator;

import java.util.Iterator;

public class GbLinkedList<T> implements Iterable<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public GbLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Метод для вставки элемента в начало списка
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Метод для вставки элемента в конец списка
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Метод для вставки элемента в середину списка по индексу
    public void insertAtIndex(T data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertAtBeginning(data);
        }else if (index == size) {
            insertAtEnd(data);
        }else {
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;

            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public T getAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }

    public Iterator<T> iterator() {
        return new GbListIterator<>();
    }

    public boolean isEmpty() {
        return size == 0;
    }


    // Метод для удаления элемента из начала списка
    public void removeFirst() {
        if (head == null) {
            return; // Ничего не делаем, если список пуст
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // Если после удаления головы список пуст, обнуляем хвост
        }

        size--;
    }

    // Метод для удаления элемента из конца списка
    public void removeLast() {
        if (isEmpty()) {
            return;
        } else if (size() == 1) {
            tail = null;
            head = null;
        } else {
            Node<T> secondToLast = null;
            Node<T> last = head;
            while (last.next != null) {
                secondToLast = last;
                last = last.next;
            }
            secondToLast.next = null;
            tail = secondToLast;
        }
        --size;
    }

    private int size() {
        return 0;
    }

    // Метод для удаления элемента по индексу
    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;

            size--;
        }
    }

}
