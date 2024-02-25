import clients.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion("Лёва", 180, LocalDate.of
                (2015, 9, 14), new Owner());
        lion.fly();
        Animal parrot = new Parrot("Кеша", 0.1f, LocalDate.of
                (2022, 4, 5), new Owner());
        parrot.swim();
        Animal bear = new Bear("Миша", 400, LocalDate.of
                (2009, 3, 8), new Owner());
        bear.fly();
        Animal goose = new Goose("Тато", 2.5f, LocalDate.of
                (2021, 5, 26), new Owner());
        goose.toGo();
        Animal kangaroo = new Kangaroo("Боксёр", 45, LocalDate.of
                (2012, 6, 18), new Owner());
        kangaroo.fly();
        Animal dog = new Dog("Шарик", 6, LocalDate.of
                (2016, 5, 11), new Owner());
        dog.fly();
    }
}