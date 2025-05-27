import java.util.ArrayList;
import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        String name;
        String choice;

        do {
            System.out.print("Enter student name: ");
            name = sc.nextLine();
            students.add(name);

            System.out.print("Add another name? (yes/no): ");
            choice = sc.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("Student names entered:");
        for (String student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}
