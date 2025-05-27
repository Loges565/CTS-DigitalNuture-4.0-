import java.util.*;

public class MethodOverloading {
   
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }


    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Add two integers: " + add(3, 5));
        System.out.println("Add two doubles: " + add(2.5, 4.3));
        System.out.println("Add three integers: " + add(1, 2, 3));
    }
}
