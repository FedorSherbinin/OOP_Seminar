import main.clinic.VeterinaryClinic;
import main.clinic.pacients.Cat;
import main.clinic.pacients.Dog;
import main.clinic.pacients.Fish;
import main.clinic.personal.Doctor;
import main.clinic.personal.LabTechnician;
import main.clinic.personal.Nurse;
import main.clinic.personal.Surgeon;

public class Mainclinic {
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
        Fish fish = new Fish();

        clinic.addPatient(new Cat());
        clinic.addPatient(new Dog());
        clinic.addPatient(new Fish());

        // Вывод списка персонала и пациентов
        clinic.printPersonnel();
        clinic.printPatients();

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
