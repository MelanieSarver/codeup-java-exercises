import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by mel on 1/10/17.
 */
public class Validator {
    Scanner scan = new Scanner(System.in);

    int getInt(String prompt) {
        int userInteger;
        System.out.println(prompt);
        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
            scan.next();
            return getInt(prompt);
        }
        return userInteger;
}

    int getIntWithinRange(String prompt, int min, int max) {
        int userRange;
        System.out.println(prompt);
        try {
            userRange = scan.nextInt();
            if (userRange > max || userRange < min) {
                throw new IllegalArgumentException("Integer is out of range.");
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Error! Integer is out of range.");
            return getIntWithinRange(prompt, min, max);
        } catch(InputMismatchException e) {
            System.out.println("Error! Invalid integer value. Try again.");
            scan.next();
            return getIntWithinRange(prompt, min, max);
        }
        return userRange;
    }

    double getDouble(String prompt) {
        double userDouble;
        System.out.println(prompt);
        try {
            userDouble = scan.nextDouble();
        } catch(InputMismatchException e) {
            scan.next();
            System.out.println("Please enter a valid decimal number");
            return getDouble(prompt);
        }
        return userDouble;
    }

    double getDoubleWithinRange(String prompt, double min, double max) {
        double userDoubleRange;
        System.out.println(prompt);
        try {
            userDoubleRange = scan.nextDouble();
            scan.nextLine();
            if (userDoubleRange > max || userDoubleRange < min) {
                throw new IllegalArgumentException("Integer is out of range.");
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Error! Invalid decimal value. Please try again.");
            return getDoubleWithinRange(prompt, min, max);
        } catch(InputMismatchException e) {
            System.out.println("Error! Invalid decimal value. Please try again.");
            scan.next();
            return getDoubleWithinRange(prompt, min, max);
        }
        return userDoubleRange;
    }

    String getRequiredString(String prompt) {
        String userString;
        System.out.println(prompt);
        try {
            userString = scan.nextLine();
            if (userString.equals("") || userString.equals(" ")) {
                throw new IllegalArgumentException("Please enter a valid word");
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Something went wrong...");
            return getRequiredString(prompt);
        }
        return userString;
    }

    public Validator(Scanner scan) {
        this.scan = scan;
    }
}
