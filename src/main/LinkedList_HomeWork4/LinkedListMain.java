package main.LinkedList_HomeWork4;

import main.LinkedList_HomeWork4.core_HW.lists_HW.GbLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        GbLinkedList<Integer> list = new GbLinkedList<>();

        list.insertAtBeginning(3);
        list.insertAtEnd(5);
        list.insertAtBeginning(6);
        list.insertAtBeginning(5);
        list.insertAtBeginning(4);
        list.insertAtEnd(1);


        System.out.println("Размер списка: " + list.getSize());
        System.out.println("Элементы списка: " + list.toString());
        System.out.println("Элемент с индексом 0: " + list.getAtIndex(0));
        System.out.println("Элемент с индексом 1: " + list.getAtIndex(1));
        System.out.println("Элемент с индексом 2: " + list.getAtIndex(2));
        System.out.println("Элемент с индексом 3: " + list.getAtIndex(3));
        System.out.println("Элемент с индексом 4: " + list.getAtIndex(4));
        System.out.println("Элемент с индексом 5: " + list.getAtIndex(5));

        System.out.println("============================");

        list.insertAtIndex(2, 2);
        System.out.println("После вставки по индексу 2: " + list.toString());

        list.insertAtIndex(1, 3);
        System.out.println("После вставки по индексу 3: " + list.toString());


        System.out.println("============================");

        list.removeFirst();
        System.out.println("После удаления первого элемента: " + list.toString());

        list.removeLast();
        System.out.println("Элементы списка после удаления последнего: " + list.toString());

        list.removeAtIndex(3);
        System.out.println("После удаления элемента с индексом 3: " + list.toString());

    }
}
