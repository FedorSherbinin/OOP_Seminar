import main.drugstore.Component;
import main.drugstore.PharmacyTwo;
import main.drugstore.component.Azitronite;
import main.drugstore.component.Penicillin;
import main.drugstore.component.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Drugmain {
    public static void main(String ... args) {
        Component water = new Water("Water", 100.0, 1);
        Component azitronite = new Azitronite("Azitronite", 20.0, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(penicillin, azitronite);

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);


//        for (Component c : p2) {
//            System.out.println(c);
//        }
    }
}
