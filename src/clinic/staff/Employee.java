package clinic.staff;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected LocalDate birthDate;
    protected String phoneNumber;
    protected String id;
    protected List<String> awards;

    public Employee(String name) {
        this.name = name;
        awards = new ArrayList<>();
    }

    public String receiveAward(String award) {
        this.awards.add(award);
        return String.format("%s получил(а) награду: %s", this.name, award);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
