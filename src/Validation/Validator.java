package Validation;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Created by mel on 1/10/17.
 */
public class Validator {
    Scanner scan;

    public int getInt(String prompt) {
        int userInteger;
        System.out.print(prompt);
        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
            scan.next();
            return getInt(prompt);
        }
        return userInteger;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userRange;
        System.out.print(prompt);
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

    public double getDouble(String prompt) {
        double userDouble;
        System.out.print(prompt);
        try {
            userDouble = scan.nextDouble();
        } catch(InputMismatchException e) {
            scan.next();
            System.out.println("Please enter a valid decimal number");
            return getDouble(prompt);
        }
        return userDouble;
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        double userDoubleRange;
        System.out.print(prompt);
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

    public String getRequiredString(String prompt) {
        String userString;
        System.out.print(prompt);
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

    public boolean moreData(String prompt) {
        String answer;
        boolean value;
        System.out.print(prompt);
        answer = scan.next();
        if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            System.out.println("Please enter 'y' or 'n'.");
            return moreData(prompt);
        }
        if (answer.equalsIgnoreCase("y")){
            value = true;
            return value;
        } else {
            value = false;
            return value;
        }
    }

    public int random(int max, int min) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public Validator(Scanner scan) {
        this.scan = scan;
    }
}


