package clinic.clients.pets;

import clinic.clients.Owner;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private float weight;
    private LocalDate birthDate;
    private Owner owner;
    private List<String> diagnoses;

    private List<String> injections;

    public Animal(String name, Owner owner) {
        super();
        this.diagnoses = new ArrayList<>();
        this.injections = new ArrayList<>();
    }

    public Animal(String name, float weight, LocalDate birthDate, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.birthDate = birthDate;
        this.owner = owner;
        this.diagnoses = new ArrayList<>();
        this.injections = new ArrayList<>();
    }

    public String addDiagnose(String diagnose) {
        this.diagnoses.add(diagnose);
        return String.format("Установлен диагноз %s для %s", diagnose, this.getName());
    }

    public String vaccinate(String vaccine) {
        this.injections.add(vaccine);
        return String.format("%s получает инъекцию %s", this.name, vaccine);
    }

    protected void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public String getAge() {
        Period period = birthDate.until(LocalDate.now());
        return String.format("%s year %s month", period.getYears(), period.getMonths());
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public String toString() {
        if (this.getBirthDate() == null) return String.format("name = %s", name);
        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, getAge(), owner);
    }
}
