import main.*;
import main.clients.*;

public class Main3 {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        // Добавление персонала в клинику
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        Surgeon surgeon = new Surgeon();
        LabTechnician labTechnician = new LabTechnician();

        clinic.addPersonnel(new Doctor());
        clinic.addPersonnel(new Nurse());
        clinic.addPersonnel(new Surgeon());
        clinic.addPersonnel(new LabTechnician());

        // Добавление животных в клинику
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish frog = new Fish();

        clinic.addPatient(new Cat());
        clinic.addPatient(new Dog());
        clinic.addPatient(new Fish());

        // Выполнение действий в ветеринарной клинике
        clinic.performMedicalExamination();
        clinic.administerMedicationToAnimals();
        clinic.conductLabTests();

        // Выполнение действий в ветеринарной клинике
        clinic.performMedicalExamination();
        clinic.administerMedicationToAnimals();
        clinic.conductLabTests();

        // Удаление персонала и пациентов
        clinic.removePersonnel(doctor);
        clinic.removePersonnel(nurse);
        clinic.removePatient(cat);

        // Проверка после удаления
        clinic.performMedicalExamination();
        clinic.administerMedicationToAnimals();
        clinic.conductLabTests();
    }
}
