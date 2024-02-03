import main.drugstore.Pharmacy;

import java.util.ArrayList;
import java.util.Collections;

public class MainHW3 {
    public static void main(String[] args) {
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        // Создаем экземпляры Pharmacy и добавляем их в список
        pharmacies.add(new Pharmacy("BioShield Max", 50));
        pharmacies.add(new Pharmacy("HealixUltra", 30));
        pharmacies.add(new Pharmacy("EnergyRestore", 40));
        pharmacies.add(new Pharmacy("VitalityBlend", 45));
        pharmacies.add(new Pharmacy("RevitalizeX", 35));

        // Сортируем по цене, используя Comparable
        Collections.sort(pharmacies);

        // Выводим отсортированный список
        System.out.println("Sorted by price:");
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println(pharmacy.getName() + " - " + pharmacy.getPrice());
        }

        // Сортируем по имени, используя дополнительный метод
        Collections.sort(pharmacies, Pharmacy::compareByName);

        // Выводим отсортированный список по имени
        System.out.println("\nSorted by name:");
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println(pharmacy.getName() + " - " + pharmacy.getPrice());
        }
    }
}
