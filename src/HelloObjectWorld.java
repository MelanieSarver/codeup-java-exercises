import java.util.Scanner;

/**
 * Created by mel on 1/6/17.
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        Scanner helloScan = new Scanner(System.in);

        Person person1 = new Person(getFirstName(helloScan), getLastName(helloScan), getEmail(helloScan));
        System.out.println("Hello, " + person1.firstName + " " + person1.lastName + ", we have your email as " + person1.email + ".");

        Person person2 = new Person(getFirstName(helloScan), getLastName(helloScan), getEmail(helloScan));
        System.out.println("Hello, " + person2.firstName + " " + person2.lastName + ", we have your email as " + person2.email + ".");

        Person person3 = new Person(getFirstName(helloScan), getLastName(helloScan), getEmail(helloScan));
        System.out.println("Hello, " + person3.firstName + " " + person3.lastName + ", we have your email as " + person3.email + ".");

    }

    public static String getFirstName(Scanner helloScan) {
        System.out.println("Please enter your first name: ");
        return helloScan.nextLine();
    }

    public static String getLastName(Scanner helloScan) {
        System.out.println("Please enter your last name: ");
        return helloScan.nextLine();
    }

    public static String getEmail(Scanner helloScan) {
        System.out.println("Please enter your email address: ");
        return helloScan.nextLine();
    }
}