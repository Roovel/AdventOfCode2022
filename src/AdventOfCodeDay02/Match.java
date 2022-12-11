package AdventOfCodeDay02;

public class Match {

    private String opponent;
    private String challenger;
    public int opponentPoints;
    public int challengerPoints;
    private int rock = 1;
    private int paper = 2;
    private int scissors = 3;
    private int win = 6;
    private int draw = 3;

    public Match(String opponent, String challenger) {
        this.opponent = opponent;
        this.challenger = challenger;
    }

    public void getMatchResultsForPart1() {
        if (opponent.equals("A") && challenger.equals("X")) {
            opponentPoints = rock + draw;
            challengerPoints = rock + draw;
        }
        if (opponent.equals("A") && challenger.equals("Y")) {
            opponentPoints = rock;
            challengerPoints = paper + win;
        }
        if (opponent.equals("A") && challenger.equals("Z")) {
            opponentPoints = rock + win;
            challengerPoints = scissors;
        }
        if (opponent.equals("B") && challenger.equals("X")) {
            opponentPoints = paper + win;
            challengerPoints = rock;
        }
        if (opponent.equals("B") && challenger.equals("Y")) {
            opponentPoints = paper + draw;
            challengerPoints = paper + draw;
        }
        if (opponent.equals("B") && challenger.equals("Z")) {
            opponentPoints = paper;
            challengerPoints = scissors + win;
        }
        if (opponent.equals("C") && challenger.equals("X")) {
            opponentPoints = scissors;
            challengerPoints = rock + win;
        }
        if (opponent.equals("C") && challenger.equals("Y")) {
            opponentPoints = scissors + win;
            challengerPoints = paper;
        }
        if (opponent.equals("C") && challenger.equals("Z")) {
            opponentPoints = scissors + draw;
            challengerPoints = scissors + draw;
        }
    }

    public void getMatchResultsForPart2() {

        if (opponent.equals("A")) {
            if (challenger.equals("X")) {
                challengerPoints = scissors;
            }
            if (challenger.equals("Y")) {
                challengerPoints = rock + draw;
            }
            if (challenger.equals("Z")) {
                challengerPoints = paper + win;
            }
        }
        if (opponent.equals("B")) {
            if (challenger.equals("X")) {
                challengerPoints = rock;
            }
            if (challenger.equals("Y")) {
                challengerPoints = paper + draw;
            }
            if (challenger.equals("Z")) {
                challengerPoints = scissors + win;
            }
        }
        if (opponent.equals("C")) {
            if (challenger.equals("X")) {
                challengerPoints = paper;
            }
            if (challenger.equals("Y")) {
                challengerPoints = scissors + draw;
            }
            if (challenger.equals("Z")) {
                challengerPoints = rock + win;
            }
        }
    }

    public void getWinnerForPart1() {
        if (opponentPoints == challengerPoints) {
            System.out.println("Draw!" + "\n" + "Opponent points: " + opponentPoints + "\n" + "Challenger points: " + challengerPoints + "\n");
        }
        if (opponentPoints < challengerPoints) {
            System.out.println("Challenger wins!" + "\n" + "Opponent points: " + opponentPoints + "\n" + "Challenger points: " + challengerPoints + "\n");
        }
        if (opponentPoints > challengerPoints){
            System.out.println("Opponent wins!" + "\n" + "Opponent points: " + opponentPoints + "\n" + "Challenger points: " + challengerPoints + "\n");
        }
    }
}
