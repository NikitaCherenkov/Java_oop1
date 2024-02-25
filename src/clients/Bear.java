package clients;

import java.time.LocalDate;

public class Bear extends Animal {
    public Bear(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void fly() {
        notCan();
    }
}
