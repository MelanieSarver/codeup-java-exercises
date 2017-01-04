import java.util.Scanner;

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
        int even = 0;
        do {
            even = even + 2;
            System.out.println(even);
        } while (even <= 100);

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

// Exercise 3 Table of Powers
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userNumber = sc.nextInt();
        for (int e = 1; e <= userNumber; e++ ) {
                System.out.println(e + " squared = " + Math.pow(e, 2) + " and " + e + " cubed = " + Math.pow(e, 3));
        }

// Exercise 4 Convert grades
        System.out.println("What score did you get on the exam?");
        int userGrade = sc.nextInt();
        if (userGrade <= 100 && userGrade >= 88) {
            System.out.println("Yay! You got an A!!");
        } else if (userGrade <= 87 && userGrade >= 80){
            System.out.println("Good job, you got a B. Study harder next time");
        } else if (userGrade <= 79 && userGrade >=67) {
            System.out.println("You got a C ? You're grounded.");
        } else if (userGrade <= 66 && userGrade >= 60) {
            System.out.println("You got a D ? Just wait 'til your Father gets home.");
        } else {
            System.out.println("You failed. Enjoy military school.");
        }
    }
}
