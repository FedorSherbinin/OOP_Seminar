package main;

import main.clients.Flyable;
import main.clients.Goable;
import main.clients.Swimable;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Goable> runningAnimals;
    private List<Swimable> swimmingAnimals;
    private List<Flyable> flyingAnimals;
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private List<Surgeon> surgeons;
    private List<LabTechnician> labTechnicians;

    public VeterinaryClinic() {
        runningAnimals = new ArrayList<>();
        swimmingAnimals = new ArrayList<>();
        flyingAnimals = new ArrayList<>();
        doctors = new ArrayList<>();
        nurses = new ArrayList<>();
        surgeons = new ArrayList<>();
        labTechnicians = new ArrayList<>();
    }

    public void addRunningAnimal(Goable animal) {
        runningAnimals.add(animal);
    }

    public void addSwimmingAnimal(Swimable animal) {
        swimmingAnimals.add(animal);
    }

    public void addFlyingAnimal(Flyable animal) {
        flyingAnimals.add(animal);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    public void addSurgeon(Surgeon surgeon) {
        surgeons.add(surgeon);
    }

    public void addLabTechnician(LabTechnician labTechnician) {
        labTechnicians.add(labTechnician);
    }

    // Дополнительные методы для работы с медицинским персоналом
    public void performMedicalExamination() {
        for (Doctor doctor : doctors) {
            doctor.diagnose();
        }

        for (Nurse nurse : nurses) {
            nurse.assistDoctor();
        }

        for (Surgeon surgeon : surgeons) {
            surgeon.performSurgery();
        }
    }

    public void administerMedicationToAnimals() {
        for (Nurse nurse : nurses) {
            nurse.administerMedication();
        }
    }

    public void conductLabTests() {
        for (LabTechnician labTechnician : labTechnicians) {
            labTechnician.conductLabTests();
        }
    }
}
