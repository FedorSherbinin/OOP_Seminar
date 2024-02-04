import main.drugstore.component.Aspirin;
import main.drugstore.Component;
import main.drugstore.Pharmacy;
import main.drugstore.component.Azitronite;
import main.drugstore.component.Penicillin;
import main.drugstore.component.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static main.drugstore.Component.sortBy;

public class Drugmain {
    public static void main(String ... args) {
        Component water = new Water("Water", 100D, 1);
        Component azitronite = new Azitronite("Azitronite", 20D, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);
        Component aspirin = new Aspirin("Aspirin", 10D, 4);

//        PharmacyTwo p1 = new PharmacyTwo();
//        p1.addComponents(water, azitronite);
//
//        PharmacyTwo p2 = new PharmacyTwo();
//        p2.addComponents(penicillin, water);
//
//        PharmacyTwo p3 = new PharmacyTwo();
//        p3.addComponents(penicillin, azitronite);

        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronite);

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(penicillin, water);

        Pharmacy p3 = new Pharmacy();
        p3.addComponents(penicillin, azitronite);

        Pharmacy p4 = new Pharmacy();
        p4.addComponents(water);

        Pharmacy p5 = new Pharmacy();
        p5.addComponents(water, penicillin, azitronite);


        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);
        components.add(aspirin);

        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

        System.out.println("----");

        List<Component> pharmacy = new ArrayList<>();
        pharmacy.add(penicillin);
        pharmacy.add(azitronite);
        pharmacy.add(water);
        pharmacy.add(aspirin);


        System.out.println(pharmacy);

        Collections.sort(pharmacy, Comparator.reverseOrder());
        System.out.println(pharmacy);

        System.out.println("----");

        System.out.println(pharmacy);

        sortBy(pharmacy);
        System.out.println(pharmacy);



//        for (Component c : p2) {
//            System.out.println(c);
//        }
    }

}
