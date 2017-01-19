import java.util.Scanner;
/**
 * @author Created by mel on 1/18/17.
 */
public class HumanPlayer extends Player {
    int chooseOpponent(Scanner scan) {
        System.out.println("You have your choice between two opponents, Luigi and Daisy.");
        Validator validator = new Validator(scan);
        return validator.getIntWithinRange("Who would you like to play against? (press 1 for Daisy, 2 for Luigi): ", 1, 2);
    }

    Roshambo opponent(int opponent) {
        if (opponent == 1) {
            RandomPlayer daisy = new RandomPlayer();
            return daisy.generateRoshambo();
        } else {
            RockPlayer luigi = new RockPlayer();
            return luigi.generateRoshambo();
        }
    }

    Roshambo generateRoshambo() {
        Scanner scan = new Scanner(System.in);
        Roshambo validChoice;
        System.out.print("Please choose rock, paper, or scissors: ");
        String userChoice = scan.next();
        try {
            validChoice = Roshambo.valueOf(userChoice.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("That's not a valid choice.");
            return generateRoshambo();
        }
        return validChoice;
    }
}
