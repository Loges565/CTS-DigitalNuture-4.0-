import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int intVal = (int) d; 
        System.out.println("Double value: " + d);
        System.out.println("After casting to int: " + intVal);

        int intVal2 = 42;
        double d2 = intVal2;
        System.out.println("Int value: " + intVal2);
        System.out.println("After casting to double: " + d2);
    }
}
