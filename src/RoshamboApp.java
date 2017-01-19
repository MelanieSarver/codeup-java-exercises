import java.util.Scanner;
/**
 * @author Created by mel on 1/18/17.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        HumanPlayer player = new HumanPlayer();
        boolean playAgain;
        int score = 0;

        String name = validator.getRequiredString("Please enter your name: ");
        System.out.println("Welcome, " + name + ".");
        do {
//            Choose your opponent
            int opponent = player.chooseOpponent(scan);
            Roshambo rival = player.opponent(opponent);

//            Choose your move
            Roshambo userChoice = player.generateRoshambo();

//            Determine the winner and tally the score
            String whoWon = Roshambo.rules(userChoice, rival);
            System.out.println(whoWon);
            score = Roshambo.score(score, whoWon);

            playAgain = validator.moreData("Would you like to play again? (Enter 'y' or 'n'): ");
        } while(playAgain);
        System.out.println("Your final score is " + score + ".");
        System.out.println("Thanks for playing!");
    }
}

