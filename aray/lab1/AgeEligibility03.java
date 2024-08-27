import java.util.*;

class AgeProcessor {
    private int age;

    public void inputAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        try {
            age = sc.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            sc.next(); // Clear the invalid input
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void checkVotingEligibility() {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}

public class AgeEligibility03 {
    public static void main(String[] args) {
        AgeProcessor ap = new AgeProcessor();
        ap.inputAge();
        ap.checkVotingEligibility();
    }
}
