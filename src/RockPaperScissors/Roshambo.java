package RockPaperScissors;

/**
 * @author Created by mel on 1/18/17.
 */
public enum Roshambo {
    ROCK, PAPER, SCISSORS;

    public static String rules(Roshambo validChoice, Roshambo opponent ) {
        String score = "";
        switch (opponent) {
            case ROCK:
                if (validChoice.equals(ROCK)) {
                    score = "Tie!";
                    return score;
                } else if (validChoice.equals(PAPER)) {
                    score = "Paper beats Rock. You win!";
                    return score;
                } else {
                    score = "Rock beats Scissors. You lose.";
                    return score;
                }
            case PAPER:
                if (validChoice.equals(PAPER)) {
                    score = "Tie";
                    return score;
                } else if (validChoice.equals(SCISSORS)) {
                    score = "Scissors beat Paper. You win!";
                    return score;
                } else {
                    score = "Paper beats Rock. You lose.";
                    return score;
                }
            case SCISSORS:
                if (validChoice.equals(SCISSORS)) {
                    score = "Tie";
                    return score;
                } else if (validChoice.equals(ROCK)) {
                    score = "Rock beats Scissors. You win!";
                    return score;
                } else {
                    score = "Scissors beats Paper. You lose.";
                    return score;
                }
            default:
                System.out.println("Something went wrong.");
        }
        System.out.println(score);
        return score;
    }

    public static int score(int score, String rules) {
        if (rules.contains("win")) {
            score++;
        } else if (rules.contains("lose")) {
            score--;
        } else {
           return score;
        }
        return score;
    }
}




