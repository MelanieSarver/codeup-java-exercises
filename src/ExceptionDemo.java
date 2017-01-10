import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by mel on 1/9/17.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the University Student Access Control Page.");
        String firstName = getString("First name: ");
        String lastName = getString("Last name: ");
        int age = getInt("Age: ");

    }

    private static String getString(String prompt) {
        Scanner scan = new Scanner(System.in);
        String inputString;
        System.out.println(prompt);
        try {
            inputString = scan.nextLine();
        } catch(Exception e) {
            System.out.println("Something went wrong...");
            return getString(prompt);
        }
        return inputString;
    }

    private static int getInt(String prompt) {
        Scanner scan = new Scanner(System.in);
        int userInteger;
        System.out.println(prompt);
        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input must be an integer, nothing else!");
            return getInt(prompt);
        }
        return userInteger;
    }
}

