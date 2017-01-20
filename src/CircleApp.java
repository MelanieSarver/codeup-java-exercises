import Validation.Validator;
import java.util.Scanner;

/**
 * @author Created by mel on 1/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        boolean anotherCircle;
        System.out.println("==================================================");
        System.out.println("Need help calculating a circle? Let's get started!");
        System.out.println("==================================================");

        do {
            double radius = validator.getDouble("Please enter the circle's radius: ");
            Circle circle = new Circle(radius);

            double circumference = circle.getCircumference(radius);
            circle.getFormattedCircumference(circumference);

            double area = circle.getArea(radius);
            circle.getFormattedArea(area);

            anotherCircle = validator.moreData("Would you like to calculate another circle? (Enter 'y' or 'n'): ");
        }while(anotherCircle);

        System.out.println("We calculated " + Circle.objectCount + " circles today. Goodbye.");
    }
}
