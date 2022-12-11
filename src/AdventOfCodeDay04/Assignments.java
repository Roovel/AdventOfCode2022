package AdventOfCodeDay04;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignments {

    private ArrayList<Integer> sectionOfFirstElf = new ArrayList<>();
    private ArrayList<Integer> sectionOfSecondElf = new ArrayList<>();
    private int fullyCointainingOtherCount = 0;
    private int containingOtherCount = 0;


    public Assignments() {
        findOverlappingAssignments();
        howManySectionsContainEachOther();
    }

    public void findOverlappingAssignments() {

        try (Scanner scanner = new Scanner(Paths.get("input04.txt"))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] sectionRange = line.split(",");
                String firstSectionRange = sectionRange[0];
                String secondSectionRange = sectionRange[1];

                String[] firstSectionMinMax = firstSectionRange.split("-");
                String[] secondSectionMinMax = secondSectionRange.split("-");


                for (int i = Integer.parseInt(firstSectionMinMax[0]); i <= Integer.parseInt(firstSectionMinMax[1]); i++) {
                    sectionOfFirstElf.add(i);
                }
                for (int i = Integer.parseInt(secondSectionMinMax[0]); i <= Integer.parseInt(secondSectionMinMax[1]); i++) {
                    sectionOfSecondElf.add(i);
                }

                if (sectionOfFirstElf.containsAll(sectionOfSecondElf) || sectionOfSecondElf.containsAll(sectionOfFirstElf)) {
                    fullyCointainingOtherCount++;
                }

                for (int i = Integer.parseInt(firstSectionMinMax[0]); i <= Integer.parseInt(firstSectionMinMax[1]); i++) {
                    if (sectionOfSecondElf.contains(i)) {
                        containingOtherCount++;
                        break;
                    }
                }

                sectionOfFirstElf.clear();
                sectionOfSecondElf.clear();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void howManySectionsContainEachOther() {
        System.out.println(fullyCointainingOtherCount + " assignments fully contain each other");
        System.out.println(containingOtherCount + " assignments atleast partly contain each other");
    }
}
