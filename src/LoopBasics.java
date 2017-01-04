/**
 * Created by mel on 1/4/17.
 */
public class LoopBasics {
    public static void main(String[] args) {
// Exercise i While Loop
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i ++;
        }

// Exercise ii Do While Loops
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

// Exercise iii For Loops
        for (int k = 5; k <= 15; k++) {
            System.out.println(k);
        }

        for (int t = 0; t <= 100; t = t+2) {
            System.out.println(t);
        }

        for (int f = 100; f >= -10; f = f-5) {
            System.out.println(f);
        }

        for (long s = 2; s <= 1000000; s = s * s) {
            System.out.println(s);
        }

    }
}
