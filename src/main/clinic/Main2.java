package main.clinic;

import main.clinic.clients.Animal;
import main.clinic.pacients.Cat;
import main.clinic.pacients.Dog;
import main.clinic.clients.Goable;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        list.add(cat);
        list.add(dog);
        System.out.println(list);
        Animal animal = new Animal() {  //Анонимный класс

            @Override
            public void eat() {

            }
        };
    }
}
