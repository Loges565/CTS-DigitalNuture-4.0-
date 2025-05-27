import java.util.*;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int r = 10 + 5 * 2;
        System.out.println("Result of 10 + 5 * 2 = " + r);
        System.out.println("Explanation: Multiplication (*) has higher precedence than addition (+), so 5 * 2 is evaluated first (10), then added to 10, resulting in 20.");

        int cr = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2 = " + cr);
        System.out.println("Explanation: Parentheses change the order, so 10 + 5 is evaluated first (15), then multiplied by 2, resulting in 30.");
    }
}
