import main.*;
import main.clients.*;

public class Main3 {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        // Добавление животных и медперсонала
        clinic.addRunningAnimal(new Cat());
        clinic.addRunningAnimal(new Dog());
        clinic.addSwimmingAnimal(new Fish());
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
