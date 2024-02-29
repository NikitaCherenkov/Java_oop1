package clinic.clients.pets.suborder;

import clinic.clients.pets.Animal;
import clinic.clients.Owner;
import clinic.clients.pets.actions.Swimmable;
import clinic.clients.pets.actions.Walkable;

import java.time.LocalDate;

public class Kangaroo extends Animal implements Walkable, Swimmable {
    public Kangaroo(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double swim() {
        return 14.6;
    }

    @Override
    public double run() {
        return 39;
    }
}
