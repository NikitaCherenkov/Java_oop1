package clients;

import java.time.LocalDate;

public class Kangaroo extends Animal {
    public Kangaroo(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void fly() {
        notCan();
    }
}
