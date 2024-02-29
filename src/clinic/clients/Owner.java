package clinic.clients;

import java.time.LocalDate;

public class Owner {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String phoneNumber;
    private String id;

    public Owner(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("%s %s, %s", name, surname, phoneNumber);
    }
}
