package clinic.pharmacy;

public abstract class DrugComponent implements Comparable<DrugComponent> {
    private String name;
    private double weight;
    private double power;

    public DrugComponent(String name, double weight, double power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public int compareTo(DrugComponent o) {
        return (int) (weight * power - o.power * o.weight);
    }

    public double getWeight() {
        return weight;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("component %s: (weight %f, power %f)", name, weight, power);
    }
}
