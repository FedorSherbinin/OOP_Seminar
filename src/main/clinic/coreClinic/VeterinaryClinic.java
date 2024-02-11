package main.clinic.coreClinic;

import main.clinic.clients.Goable;
import main.clinic.personal.Doctor;
import main.clinic.personal.LabTechnician;
import main.clinic.personal.Nurse;
import main.clinic.personal.Surgeon;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Doctor> personnel;
    private List<Object> patients; // Пациенты могут быть животными или другими объектами

    public VeterinaryClinic() {
        personnel = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addPersonnel(Doctor doctor) {
        personnel.add(doctor);
    }

    public void addPersonnel(Nurse nurse) {
        personnel.add(nurse);
    }

    public void addPersonnel(Surgeon surgeon) {
        personnel.add(surgeon);
    }

    public void addPatient(Object patient) {
        patients.add(patient);
    }

    public void removePersonnel(Doctor doctor) {
        personnel.remove(doctor);
    }

    public void removePersonnel(Nurse nurse) {
        personnel.remove(nurse);
    }

    public void removePersonnel(Surgeon surgeon) {
        personnel.remove(surgeon);
    }

    public void removePatient(Object patient) {
        patients.remove(patient);
    }

    public void printPersonnel() {
        System.out.println("Personnel List:");
        for (Doctor doctor : personnel) {
            System.out.println(" - " + doctor.getClass().getSimpleName());
        }
        System.out.println();
    }

    public void printPatients() {
        System.out.println("Patients List:");
        for (Object patient : patients) {
            System.out.println(" - " + patient.getClass().getSimpleName());
        }
        System.out.println();
    }

    // Дополнительные методы для работы с персоналом и пациентами
    public void performMedicalExamination() {
        for (Doctor doctor : personnel) {
            doctor.diagnose();
        }

        for (Nurse nurse : findNurses()) {
            nurse.assistDoctor();
        }

        for (Surgeon surgeon : findSurgeons()) {
            surgeon.performSurgery();
        }

        for (Object patient : patients) {
            if (patient instanceof Goable) {
                // Логика медицинского обследования пациента, который может бегать
            }
        }
    }

    public void administerMedicationToAnimals() {
        for (Nurse nurse : findNurses()) {
            nurse.administerMedication();
        }
    }

    public void conductLabTests() {
        for (LabTechnician labTechnician : findLabTechnicians()) {
            labTechnician.conductLabTests();
        }
    }

    private List<Nurse> findNurses() {
        List<Nurse> nurses = new ArrayList<>();
        for (Doctor doctor : personnel) {
            if (doctor instanceof Nurse) {
                nurses.add((Nurse) doctor);
            }
        }
        return nurses;
    }

    private List<Surgeon> findSurgeons() {
        List<Surgeon> surgeons = new ArrayList<>();
        for (Doctor doctor : personnel) {
            if (doctor instanceof Surgeon) {
                surgeons.add((Surgeon) doctor);
            }
        }
        return surgeons;
    }

    private List<LabTechnician> findLabTechnicians() {
        List<LabTechnician> labTechnicians = new ArrayList<>();
        for (Nurse nurse : findNurses()) {
            if (nurse instanceof LabTechnician) {
                labTechnicians.add((LabTechnician) nurse);
            }
        }
        return labTechnicians;

    }

}
