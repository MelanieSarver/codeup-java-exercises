import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Created by mel on 1/17/17.
 */
public class BlockbusterApp {
    public static void main(String[] args) {
        System.out.println("***********************");
        System.out.println(" *********************");
        System.out.println(" Welcome to Blockbuster");
        System.out.println(" *********************");
        System.out.println("***********************");
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        boolean moreMovies = false;

        ArrayList<Movie> moviesArray = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            moviesArray.add(MovieIO.getMovie(i));
        }

        do {
            String genre = validator.getRequiredString("Please select a genre: ");
            getList(genre, moviesArray);
            moreMovies = validator.moreData("Would you like to choose another genre? (Enter 'y' or 'n'): ");
            scan.nextLine();
        } while(moreMovies);
    }


    private static void getList(String genre, ArrayList<Movie> moviesArray) {
        for (Movie movie : moviesArray) {
            if (movie.getCategory().equals(genre)) {
                System.out.println(movie.getTitle());
            }
        }
    }
}