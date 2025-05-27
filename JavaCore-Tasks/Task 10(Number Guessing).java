import java.util.*;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess the number between 1 and 100.");

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < target) {
                System.out.println("Too low, try again.");
            } else if (guess > target) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }

        sc.close();
    }
}
