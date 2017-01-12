import java.util.Scanner;

/**
 * Created by mel on 1/10/17.
 */
public class HiLowApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        System.out.println("Let's play a guessing game!");
        System.out.println("I'll choose a number, and you try to guess it!");
        System.out.println("Don't worry, I'll give you clues as we play.");
        int random = validator.random(100, 1);
        int counter = 0;
        boolean ready = validator.moreData("Ready to play? (please enter 'y' or 'n' to continue) ");


        while(ready) {
            int userGuess = validator.getIntWithinRange("Please guess a number between 1 and 100. ", 1, 100);
            counter ++;
            if (counter > 15) {
                System.out.println("Looks like you're having a hard time guessing.");
                counter = 0;
                random = validator.random(100, 1);
                ready = validator.moreData("Would you like to try a new number? ");
            }
            if (userGuess > random) {
                System.out.println("Lower.");
            } else if (userGuess < random) {
                System.out.println("Higher.");
            } else {
                System.out.println("Congratulations!! You got it right!");
                ready = validator.moreData("Would you like to play again? ");
                random = validator.random(100, 1);
            }
        }
    }




}

