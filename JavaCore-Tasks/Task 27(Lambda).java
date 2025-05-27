import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Zoe", "Bob");
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted names:");
        names.forEach(System.out::println);
    }
}
