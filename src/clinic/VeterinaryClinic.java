package clinic;

import clinic.clients.pets.Animal;
import clinic.clients.pets.actions.Flyable;
import clinic.clients.pets.actions.Swimmable;
import clinic.clients.pets.actions.Walkable;
import clinic.staff.Employee;
import clinic.staff.profession.Doctor;
import clinic.staff.profession.Nurse;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private final String name;
    private final List<Employee> employees;

    private final List<Animal> treatmentAnimals;

    public VeterinaryClinic() {
        this.name = "Вет. клиника";
        this.employees = new ArrayList<>();
        this.treatmentAnimals = new ArrayList<>();
    }

    public void admitPatient(Animal animal) {
        this.treatmentAnimals.add(animal);
    }

    public void hireEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void fireEmployee(Employee employee) {
        if (this.employees.contains(employee)) this.employees.remove(employee);
    }

    public String giveBonuse(Employee employee, String award) {
        return employee.receiveAward(award);
    }

    public List<Employee> getAllDoctors(){
        List<Employee> ret = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee instanceof Doctor) ret.add(employee);
        }
        return ret;
    }

    public List<Employee> getAllNurses(){
        List<Employee> ret = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee instanceof Nurse) ret.add(employee);
        }
        return ret;
    }

    public List<Animal> getAllWalkable() {
        List<Animal> ret = new ArrayList<>();
        for (Animal animal: treatmentAnimals) {
            if (animal instanceof Walkable) ret.add(animal);
        }
        return ret;
    }

    public List<Animal> getAllFlyable() {
        List<Animal> ret = new ArrayList<>();
        for (Animal animal: treatmentAnimals) {
            if (animal instanceof Flyable) ret.add(animal);
        }
        return ret;
    }

    public List<Animal> getAllSwimmable() {
        List<Animal> ret = new ArrayList<>();
        for (Animal animal: treatmentAnimals) {
            if (animal instanceof Swimmable) ret.add(animal);
        }
        return ret;
    }
}
