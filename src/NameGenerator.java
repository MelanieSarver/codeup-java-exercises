import java.util.Random;
import java.util.Scanner;
/**
 * Created by mel on 1/11/17.
 */
public class NameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"New", "Brave", "Pink", "Silly", "Ugly", "Yellow", "Beautiful", "Scary", "Huge", "Calm"};
        String[] nouns = {"Rock", "Bird", "Flower", "Puppy", "Seashell", "Monster", "Apple", "Tree", "Cup", "Lake"};
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        System.out.println("Welcome to the silly name generator! ");
        boolean another = validator.moreData("Would you like the generator to pick a name for you? (enter 'y' or 'n'): ");

        while(another) {
            String adjective = randomElement(adjectives, random);
            String noun = randomElement(nouns, random);

            System.out.println("Your silly name is: " + adjective + " " + noun + ".");
            another = validator.moreData("Would you like to choose another name? (enter 'y' or 'n'): ");
        }
    }

    public static String randomElement(String[] array, Random random) {
        return array[random.nextInt(array.length)];
    }

}

