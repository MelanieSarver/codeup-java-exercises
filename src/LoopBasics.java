/**
 * Created by mel on 1/4/17.
 */
public class LoopBasics {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i ++;
        }

        int fives = 100;
        do {
            System.out.println(fives);
            fives = fives - 5;
        } while (fives >= -10);

        long squared = 2;
        do {
            System.out.println(squared);
            squared = squared * squared;
        } while (squared < 1000000);




    }
}
