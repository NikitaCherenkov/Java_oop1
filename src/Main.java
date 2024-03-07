import clinic.pharmacy.MedicalDrug;
import clinic.pharmacy.DrugComponent;
import clinic.pharmacy.components.Azithromycin;
import clinic.pharmacy.components.Penicillin;
import clinic.pharmacy.components.Vetbitsin;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Azithromycin asitr = new Azithromycin("Asitro", 50, 70);
        Penicillin penicillin = new Penicillin("Penicil", 30, 50);
        Vetbitsin vetbic = new Vetbitsin("Vetbic", 42, 30);
        Azithromycin asitr1 = new Azithromycin("Asitro", 50, 70);
        Penicillin penicillin2 = new Penicillin("Penicil", 30, 50);
        Vetbitsin vetbic3 = new Vetbitsin("Vetbic", 40, 30);
        MedicalDrug medicalDrug1 = new MedicalDrug();
        MedicalDrug medicalDrug2 = new MedicalDrug();
        medicalDrug1.addComponent(asitr).addComponent(penicillin).addComponent(vetbic);
        medicalDrug2.addComponent(asitr1);
        medicalDrug2.addComponent(penicillin2);
        medicalDrug2.addComponent(vetbic3);
        Iterator<DrugComponent> med = medicalDrug1;
        while (med.hasNext()) {
            System.out.println(med.next());
        }
        System.out.println(medicalDrug1.compareTo(medicalDrug2));
        System.out.println(medicalDrug1);
    }
}