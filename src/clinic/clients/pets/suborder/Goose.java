package clinic.clients.pets.suborder;

import clinic.clients.pets.Animal;
import clinic.clients.Owner;
import clinic.clients.pets.actions.Flyable;
import clinic.clients.pets.actions.Swimmable;
import clinic.clients.pets.actions.Walkable;

import java.time.LocalDate;

public class Goose extends Animal implements Walkable, Swimmable, Flyable {
    public Goose(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 50.5;
    }

    @Override
    public double swim() {
        return 8;
    }

    @Override
    public double run() {
        return 10;
    }
}
