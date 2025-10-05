import java.security.SecureRandom;
import java.util.Scanner;

public class StrongPasswordGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = sc.nextInt();

        // Capitalize first letter of username
        username = username.substring(0, 1).toUpperCase() + username.substring(1);

        // Extract last two digits of mobile
        String lastTwo = mobile.substring(mobile.length() - 2);

        // Random parts
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*";
        String digits = "0123456789";

        // Generate random chars
        char randUpper1 = upper.charAt(random.nextInt(upper.length()));
        char randUpper2 = upper.charAt(random.nextInt(upper.length()));
        char randSpecial1 = special.charAt(random.nextInt(special.length()));
        char randSpecial2 = special.charAt(random.nextInt(special.length()));
        char randDigit1 = digits.charAt(random.nextInt(digits.length()));
        char randDigit2 = digits.charAt(random.nextInt(digits.length()));

        // Final password
        String password = username + "@" + lastTwo + month +
                randUpper1 + randUpper2 + randSpecial1 + randSpecial2 + randDigit1 + randDigit2;

        System.out.println("Generated Strong Password: " + password);
    }
}
