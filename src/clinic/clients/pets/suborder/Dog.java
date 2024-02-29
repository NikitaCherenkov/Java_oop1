package clinic.clients.pets.suborder;

import clinic.clients.pets.Animal;
import clinic.clients.Owner;
import clinic.clients.pets.actions.Swimmable;
import clinic.clients.pets.actions.Walkable;

import java.time.LocalDate;

public class Dog extends Animal implements Walkable, Swimmable {
    public Dog(String name, Owner owner) {
        super(name, owner);
    }

    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double swim() {
        return 8.4;
    }

    @Override
    public double run() {
        return 36.1;
    }
}
