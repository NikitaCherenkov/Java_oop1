package clinic.clients.pets.suborder;

import clinic.clients.pets.Animal;
import clinic.clients.Owner;
import clinic.clients.pets.actions.Swimmable;
import clinic.clients.pets.actions.Walkable;

import java.time.LocalDate;

public class Bear extends Animal implements Walkable, Swimmable {
    public Bear(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }


    @Override
    public double swim() {
        return 15;
    }

    @Override
    public double run() {
        return 31.8;
    }
}
