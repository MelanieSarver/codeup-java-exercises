package RockPaperScissors;

import Validation.Validator;

import java.util.Scanner;
/**
 * @author Created by mel on 1/18/17.
 */
public class RandomPlayer extends Player{
    @Override

//    Daisy
    Roshambo generateRoshambo() {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        int rps = validator.random(3,1);
        if (rps == 1) {
            return Roshambo.ROCK;
        } else if (rps == 2) {
            return Roshambo.SCISSORS;
        } else {
            return Roshambo.PAPER;
        }
    }
}

