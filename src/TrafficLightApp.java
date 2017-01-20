import java.util.Scanner;
/**
 * @author Created by mel on 1/12/17.
 */
public class TrafficLightApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("     Driving?");
        System.out.println("     Confused about the traffic light ahead?");
        System.out.println("     There's an app for that!");
        System.out.println("================================================");

        getUserInput(scan);
    }

    private static String getUserInput(Scanner scan) {
        System.out.println("What color is the light? ");
        String userColor = scan.next();
        userColor = userColor.toUpperCase();
        try {
            TrafficLightColor color = TrafficLightColor.valueOf(userColor);
            makeDrivingDescision(color);
        } catch (IllegalArgumentException e) {
            System.out.println("That's not even possible.");
            return getUserInput(scan);
        }
        return userColor;
    }

    private static void makeDrivingDescision(TrafficLightColor color) {
        switch (color) {
            case RED:
                System.out.println("STOP!!!!!!");
                break;
            case YELLOW:
                System.out.println("The light is about to change to red. Prepare to stop.");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
            default:
                System.out.println("Something went wrong.");
        }
    }
}
