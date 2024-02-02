package main;

import main.clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай"), 10D); //Создаём экземпляр класса

//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickName());
//        System.out.println("Болезнь:" + cat.getIllness());
//
//        System.out.println(cat.getNickName());
//
//        cat.setIllness(new Illness(null));
//
//        System.out.println("Болезнь:" + cat.getIllness());


//        Animal testAnimal = new Animal();
//        System.out.println(testAnimal.getNickName());
//
//        cat.lifeCycle();

//        Animal catty = new Cat();
//        Dog goodBoy = new Dog();
//
//        System.out.println(goodBoy.getType());
//        System.out.println(catty.getType());
//
//        System.out.println(catty);
//
//        Cat.meow();

//        Dog.toGo();
//        Dog.fly();
//        Dog.swim();
//
//        Fish.toGo();
//        Fish.fly();
//        Fish.swim();
//
//        Frog.toGo();
//        Frog.fly();
//        Frog.swim();


//        List<Animal> animals = new ArrayList<Animal>();
//
//        animals.add(catty);
//        animals.add(goodBoy);
//        animals.add(cat);
//
//        int i = 0;
//        for (Animal animal : animals) {
//            System.out.println(i + " " + animal);
//            i++;
//        }
        System.out.println();

    }
}