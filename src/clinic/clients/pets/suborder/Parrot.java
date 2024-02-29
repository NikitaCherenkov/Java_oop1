package clinic.clients.pets.suborder;

import clinic.clients.pets.Animal;
import clinic.clients.Owner;
import clinic.clients.pets.actions.Flyable;
import clinic.clients.pets.actions.Walkable;

import java.time.LocalDate;

public class Parrot extends Animal implements Walkable, Flyable {
    public Parrot(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 90;
    }

    @Override
    public double run() {
        return 4;
    }
}
