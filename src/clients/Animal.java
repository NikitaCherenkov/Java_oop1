package clients;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate birthDate;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate birthDate, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.birthDate = birthDate;
        this.owner = owner;
    }

    public void sleep() {
        System.out.println(getType() + " is sleeping");
    }

    public void wakeup() {
        System.out.println(getType() + " waked up");
    }

    public void wakeup(LocalTime time) {
        System.out.println(getType() + String.format(" waked up at %d:%d", time.getHour(), time.getMinute()));
    }

    public void eat() {
        System.out.println(getType() + " is eating");
    }

    public void play() {
        System.out.println(getType() + " is playing");
    }

    public void toGo() {
        System.out.println(getType() + " going to...");
    }

    public void fly() {
        System.out.println(getType() + " is flying");
    }

    public void swim() {
        System.out.println(getType() + " is swimming");
    }

    public void notCan() {
        System.out.println(getType() + " can't do that");
    }

    public String getType() {
        return getClass().getSimpleName();
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

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, getAge(), owner);
    }
}
