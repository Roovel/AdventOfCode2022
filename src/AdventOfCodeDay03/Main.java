package AdventOfCodeDay03;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        ArrayList<String> third = new ArrayList<>();
        ArrayList<String> firstPart = new ArrayList<>();
        ArrayList<String> secondPart = new ArrayList<>();
        ArrayList<String> commonCharactersListPart2 = new ArrayList<>();
        String commonCharactersStringPart2 = "";
        ArrayList<String> commonCharactersListPart1 = new ArrayList<>();
        String commonCharactersStringPart1 = "";
        int priorityPart1;
        int priorityTotalPart1 = 0;
        int priorityPart2;
        int priorityTotalPart2 = 0;
        int count = 0;

        try (Scanner scanner = new Scanner(Paths.get("input03.txt"))) {
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String toFirst = line.substring(0, line.length() / 2);
                String toSecond = line.substring(line.length() / 2);

                firstPart.add(toFirst);
                secondPart.add(toSecond);

                count++;

                if (count == 1) {
                    first.add(line);
                }

                if (count == 2) {
                    second.add(line);
                }

                if (count == 3) {
                    third.add(line);
                    count = 0;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        for (int i = 0; first.size() > i; i++) {
            ArrayList<String> commonCharactersHelp = new ArrayList<>();

            if (first.get(i).length() >= second.get(i).length() && first.get(i).length() >= third.get(i).length()) {
                for (int j = 0; first.get(i).length() > j; j++) {
                    if (second.get(i).contains(first.get(i).substring(j, j+1)) && third.get(i).contains(first.get(i).substring(j, j+1))) {
                        commonCharactersStringPart2 = first.get(i).substring(j, j+1);
                        if (!commonCharactersHelp.contains(commonCharactersStringPart2)) {
                            commonCharactersHelp.add(commonCharactersStringPart2);
                        }
                    }
                }
            }
            if (second.get(i).length() >= first.get(i).length() && second.get(i).length() >= third.get(i).length()) {
                for (int j = 0; second.get(i).length() > j; j++) {
                    if (first.get(i).contains(second.get(i).substring(j, j+1)) && third.get(i).contains(second.get(i).substring(j, j+1))) {
                        commonCharactersStringPart2 = second.get(i).substring(j, j+1);
                        if (!commonCharactersHelp.contains(commonCharactersStringPart2)) {
                            commonCharactersHelp.add(commonCharactersStringPart2);
                        }
                    }
                }
            }
            if (third.get(i).length() >= second.get(i).length() && third.get(i).length() >= first.get(i).length()) {
                for (int j = 0; third.get(i).length() > j; j++) {
                    if (second.get(i).contains(third.get(i).substring(j, j+1)) && first.get(i).contains(third.get(i).substring(j, j+1))) {
                        commonCharactersStringPart2 = third.get(i).substring(j, j+1);
                        if (!commonCharactersHelp.contains(commonCharactersStringPart2)) {
                            commonCharactersHelp.add(commonCharactersStringPart2);
                        }
                    }
                }
            }

            commonCharactersListPart2.addAll(commonCharactersHelp);
        }


        for (int i = 0; firstPart.size() > i; i++) {
            ArrayList<String> commonCharactersHelp = new ArrayList<>();

            for (int j = 0; firstPart.get(i).length() > j; j++) {

                if (secondPart.get(i).contains(firstPart.get(i).substring(j, j+1))) {
                    commonCharactersStringPart1 = firstPart.get(i).substring(j, j+1);

                    if (!commonCharactersHelp.contains(commonCharactersStringPart1)) {
                        commonCharactersHelp.add(commonCharactersStringPart1);
                    }
                }
            }

            commonCharactersListPart1.addAll(commonCharactersHelp);
        }

        for (String index : commonCharactersListPart2) {
            char character = index.charAt(0);


            if (Character.isUpperCase(character)) {
                priorityPart2 = Character.toLowerCase(character) - 'a' + 27;
                priorityTotalPart2 += priorityPart2;
            }

            if (Character.isLowerCase(character)) {
                priorityPart2 = character - 'a' + 1;
                priorityTotalPart2 += priorityPart2;
            }
        }

        for (String index : commonCharactersListPart1) {
            char character = index.charAt(0);

            if (Character.isUpperCase(character)) {
                priorityPart1 = Character.toLowerCase(character) - 'a' + 27;
                priorityTotalPart1 += priorityPart1;
            }

            if (Character.isLowerCase(character)) {
                priorityPart1 = character - 'a' + 1;
                priorityTotalPart1 += priorityPart1;
            }
        }

        System.out.println("The sum on the priorities of common item types for part 1 is: " + priorityTotalPart1);
        System.out.println("The sum on the priorities of common item types for part 2 is: " + priorityTotalPart2);
    }

}
