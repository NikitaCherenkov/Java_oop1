package clinic.staff.profession;

import clinic.clients.pets.Animal;
import clinic.staff.Employee;

public class Nurse extends Employee {
    public Nurse(String name) {
        super(name);
    }

    public String giveAnInjection(Animal animal, String vaccine) {
        return String.format("%s от %s", animal.vaccinate(vaccine), this.getName());
    }
}
