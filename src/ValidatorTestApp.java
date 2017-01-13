import java.util.Scanner;

/**
 * Created by mel on 1/10/17.
 */
public class ValidatorTestApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        System.out.println("Let's test some exceptions! Woohoo!");

        int userInteger = validator.getInt("Please enter an integer");
        System.out.println("You entered " + userInteger + ".");

        int userRange = validator.getIntWithinRange("Please enter an integer between -100 and 100.", -100, 100);
        System.out.println("You entered " + userRange + ".");

        double userDouble = validator.getDouble("Please enter a decimal number.");
        System.out.println("You entered " + userDouble + ".");

        double userDoubleRange = validator.getDoubleWithinRange("Please enter a decimal number between 0 and 11", 0.0, 11.0);
        System.out.println("You entered " + userDoubleRange + ".");

        String userString = validator.getRequiredString("Please enter your favorite word.");
        System.out.println("You entered " + userString + ".");
    }
}
