import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        // Check length
        if (password.length() >= 8) {
            score++;
        }

        // Check uppercase
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Check lowercase
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Check numbers
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Check special characters
        if (password.matches(".*[!@#$%^&*()].*")) {
            score++;
        }

        // Display result
        if (score <= 2) {
            System.out.println("Password Strength: Weak");
        } 
        else if (score == 3 || score == 4) {
            System.out.println("Password Strength: Medium");
        } 
        else {
            System.out.println("Password Strength: Strong");
        }

        sc.close();
    }
}
