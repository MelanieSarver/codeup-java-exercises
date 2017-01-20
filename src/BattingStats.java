import Validation.Validator;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Created by mel on 1/11/17.
 */
public class BattingStats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        int atBats;
        int bases;
        boolean keepGoing;

        System.out.println("           Sports stats! Yay...");
        System.out.println("           ====================");

        do {
            atBats = validator.getInt("How many times did the player bat? ");

            int[] player = new int[atBats];
            for (int i = 0; i < player.length; i++) {
                bases = validator.getIntWithinRange("Which base did they get to? ", 0, 4);
                player[i] = bases;
            }
//Print out players's data
            System.out.println("Player's game stats: " + Arrays.toString(player));
            battingAvg(player, atBats);
            sluggingPercent(player, atBats);

            keepGoing = validator.moreData("Do you have more players to enter? ");
        } while(keepGoing);

    }

    private static float battingAvg(int[] player, int atBats) {
        int onBase = 0;
        for(int i = 0; i < player.length; i++) {
            if(player[i] > 0) {
                onBase ++;
            }
        }
        float average = (float) onBase / atBats;
        String averageFormat = String.format("%.3f", average);
        System.out.println("Batting Average: " + averageFormat);
        return average;
    }

    private static float sluggingPercent(int[] player, int atBats) {
        int sum = IntStream.of(player).sum();
        float percentage =  (float) sum / atBats;
        String percentageFormat = String.format("%.3f", percentage);
        System.out.println("Slugging Percentage: " + percentageFormat);
        return percentage;
    }
}
