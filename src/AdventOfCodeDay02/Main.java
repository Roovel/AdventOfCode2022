package AdventOfCodeDay02;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Match> matches = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("input02.txt"))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String opponent = parts[0];
                String challenger = parts[1];
                matches.add(new Match(opponent, challenger));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int challengerPoints = 0;
        int opponentPoints = 0;

        for (Match match : matches) {
            match.getMatchResultsForPart1();
            //match.getWinnerForPart1();
            challengerPoints += match.challengerPoints;
            opponentPoints += match.opponentPoints;

        }
        System.out.println("Total points for opponent in part 1: " + opponentPoints);
        System.out.println("Total points for challenger in part 1: " + challengerPoints);

        if (opponentPoints < challengerPoints) {
            System.out.println("Challenger wins part 1 with " + (challengerPoints - opponentPoints) + " point difference!" + "\n");
        }

        if (challengerPoints < opponentPoints) {
            System.out.println("Opponent wins part 1 with " + (opponentPoints - challengerPoints) + " point difference!" + "\n");
        }

        challengerPoints = 0;

        for (Match match : matches) {
            match.getMatchResultsForPart2();
            challengerPoints += match.challengerPoints;
        }

        System.out.println("Total points for challenger in part 2: " + challengerPoints);
    }
}
