import java.util.List;

public class RecordExample {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Loges", 20),
            new Person("Hari", 13),
            new Person("Avinash", 22)
        );

        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}
