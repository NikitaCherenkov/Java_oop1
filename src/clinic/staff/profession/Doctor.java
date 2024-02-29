package clinic.staff.profession;

import clinic.clients.pets.Animal;
import clinic.staff.Employee;

public class Doctor extends Employee {
    public Doctor(String name) {
        super(name);
    }

    public String setDiagnose(String diagnose, Animal animal) {
        return String.format("%s доктором %s", animal.addDiagnose(diagnose), this.getName());
    }
}
