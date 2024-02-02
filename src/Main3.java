import main.*;
import main.clients.Bird;
import main.clients.Cat;
import main.clients.Dog;
import main.clients.Frog;

public class Main3 {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        // Добавление животных и медперсонала
        clinic.addRunningAnimal(new Cat());
        clinic.addRunningAnimal(new Dog());
        clinic.addRunningAnimal(new Frog());
        clinic.addSwimmingAnimal(new Dog());
        clinic.addFlyingAnimal(new Bird());

        clinic.addDoctor(new Doctor());
        clinic.addNurse(new Nurse());
        clinic.addSurgeon(new Surgeon());
        clinic.addLabTechnician(new LabTechnician());

        // Выполнение действий в ветеринарной клинике
        clinic.performMedicalExamination();
        clinic.administerMedicationToAnimals();
        clinic.conductLabTests();
    }
}
