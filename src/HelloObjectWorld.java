import java.util.Scanner;

/**
 * Created by mel on 1/6/17.
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        Scanner helloScan = new Scanner(System.in);
        Person newPerson = new Person();
        System.out.println("Please enter your first name: ");
        newPerson.firstName = helloScan.nextLine();
        System.out.println("Please enter your last name: ");
        newPerson.lastName = helloScan.nextLine();
        System.out.println("Please enter your email address: ");
        newPerson.email = helloScan.nextLine();
        System.out.println("Hello, " + newPerson.firstName + " " + newPerson.lastName + ", we have your email as " + newPerson.email + ".");
    }
}
