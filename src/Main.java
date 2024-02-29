import clinic.VeterinaryClinic;
import clinic.clients.*;
import clinic.clients.pets.suborder.*;
import clinic.staff.profession.Doctor;
import clinic.staff.profession.Nurse;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic vetClinic = new VeterinaryClinic();
        Doctor doc = new Doctor("Док");
        vetClinic.hireEmployee(doc);
        Nurse nurse = new Nurse("Медсестра");
        vetClinic.hireEmployee(nurse);
        Dog patient = new Dog("Пёс", new Owner("Владелец"));
        vetClinic.admitPatient(patient);
        System.out.println(doc.setDiagnose("Ушиб", patient));
        System.out.println(vetClinic.giveBonuse(doc, "Заслуженная награда"));
        System.out.println(nurse.giveAnInjection(patient, "вакцина"));
        System.out.println(String.format("%s бежит со скоростью %f", patient.getName(), patient.run()));
        System.out.println(vetClinic.getAllSwimmable());
        System.out.println(vetClinic.getAllDoctors());
    }
}