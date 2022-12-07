import java.nio.file.Paths;
import java.util.Scanner;

public class CalorieCounting {

    static int calories = 0;

    public static void main(String[] args) {

        Elves elves = new Elves();

        try (Scanner scanner = new Scanner(Paths.get("input.txt"))) {
            while (scanner.hasNextLine()) {
                String stringRow = scanner.nextLine();

                if (!stringRow.equals("")) {
                    int row = Integer.parseInt(stringRow);
                    calories += row;
                }

                if (stringRow.equals("")) {
                    elves.addElfCalories(calories);
                    calories = 0;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        elves.getHighest();
        elves.sumOfHighestThree();
    }
}
