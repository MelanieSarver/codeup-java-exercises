import java.util.Scanner;

/**
 * Created by mel on 1/4/17.
 */
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        System.out.println("May I please ask you a few unrelated questions?");
        response = sc.next();
        if (response.equals("yes")) {
            int userNumber;
            System.out.println("Please enter a number: ");
            userNumber = sc.nextInt();
            System.out.println("The number you entered was " + userNumber);
            //The following line ensures the next question isn't skipped
            sc.nextLine();

            String userString;
            System.out.println("Please type a sentence: ");
            userString = sc.nextLine();
            System.out.println(userString);

            String word1;
            String word2;
            String word3;
            System.out.println("Now we'll enter three separate words.");
            System.out.println("Please enter the 1st word: ");
            word1 = sc.next();
            System.out.println("Please enter the 2nd word: ");
            word2 = sc.next();
            System.out.println("Please enter the third word: ");
            word3 = sc.next();
            System.out.println("Thank you for entering " + word1 + ", " + word2 + ", " + word3);

            System.out.println("Let's measure the classroom!");
            String answer;
            do {
                float length;
                float width;
                float height;
                System.out.println("Please enter the length: ");
                length = sc.nextFloat();
                System.out.println("Please enter the width: ");
                width = sc.nextFloat();
                System.out.println("Please enter the ceiling height: ");
                height = sc.nextFloat();
                float perimeter = ((length * 2) + (width * 2));
                float area = (length * width);
                float volume = (length * width * height);
                System.out.println("The classroom perimeter is: " + perimeter);
                System.out.println("The classroom area is " + area);
                System.out.println("the classroom volume is " + volume);
                System.out.println("Would you like to measure another room? ");
                answer = sc.next();
                if (!answer.equals("yes") && !answer.equals("no")) {
                    System.out.println("Please enter 'yes' or 'no'.");
                    answer = sc.next();
                }
            } while (answer.equals("yes"));
        } else if (!response.equals("yes") && !response.equals("no")) {
            System.out.println("Please enter 'yes' or 'no'.");
            response = sc.next();
        }
    }
}
