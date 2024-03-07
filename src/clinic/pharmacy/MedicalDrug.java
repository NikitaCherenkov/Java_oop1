package clinic.pharmacy;

import java.util.*;

public class MedicalDrug implements Iterator<DrugComponent>, Comparable<MedicalDrug> {
    private List<DrugComponent> components;
    private int index;

    public MedicalDrug() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public MedicalDrug addComponent(DrugComponent component) {
        components.add(component);
        return this;
    }

    private List<Double> componentsStrength(MedicalDrug md) {
        List<Double> ret = new ArrayList<>();
        for (DrugComponent dc : md.components) {
            ret.add(dc.getWeight() * dc.getPower());
        }
        return ret;
    }

    @Override
    public boolean hasNext() {  // components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public DrugComponent next() {   // components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Medical Drug: ");
        for (int i = 0; i < this.components.size(); i++) {
            if (i > 0) sb.append("              ");
            sb.append(this.components.get(i).toString());
            if (i < this.components.size() - 1) sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public int compareTo(MedicalDrug o) {
        List<Double> thisDrug = componentsStrength(this);
        List<Double> comparedDrug = componentsStrength(o);
        if (components.size() == o.components.size()) {
            Collections.sort(thisDrug);
            Collections.sort(comparedDrug);
            if (thisDrug.equals(comparedDrug)) {
                return 0;
            }
        }
        return (int) (Arrays.stream(thisDrug.stream().toArray()).mapToDouble(a -> (double) a).sum()
                - Arrays.stream(comparedDrug.stream().toArray()).mapToDouble(a -> (double) a).sum());
    }
}
