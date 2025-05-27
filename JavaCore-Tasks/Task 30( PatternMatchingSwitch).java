public class PatternMatchingSwitch {
    public static void typeChecker(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            case null -> System.out.println("It's null");
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        typeChecker(42);
        typeChecker("hello");
        typeChecker(3.14);
        typeChecker(null);
    }
}
 // Note: Requires Java 21+ and --enable-preview with compilation and runtime.