package AdventOfCodeDay05;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Crane {

    public ArrayList<Integer> amount;
    public ArrayList<Integer> from;
    public ArrayList<Integer> to;

    public Crane() {
        this.amount = new ArrayList<>();
        this.from = new ArrayList<>();
        this.to = new ArrayList<>();
    }

    public void getInstructions(String inputFile) {
        try (Scanner scanner = new Scanner(Paths.get(inputFile))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                this.amount.add(Integer.parseInt(parts[1]));
                this.from.add(Integer.parseInt(parts[3]));
                this.to.add(Integer.parseInt(parts[5]));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printInstructions() {
        System.out.println(amount + "\n" + from + "\n" + to);
    }

}
