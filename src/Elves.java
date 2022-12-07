import java.util.ArrayList;
import java.util.Collections;

public class Elves {

    private int highestCalories, secondHighest, thirdHighest;
    private int calorieCount;
    private ArrayList<Integer> elves;

    public Elves() {
        this.elves = new ArrayList<>();
    }

    public void addElfCalories(int calorieCount) {
        elves.add(calorieCount);
    }

    public void sumOfHighestThree() {
        Collections.sort(elves);
        highestCalories = elves.get(elves.size()-1);
        secondHighest = elves.get(elves.size()-2);
        thirdHighest = elves.get(elves.size()-3);
        System.out.println(highestCalories+secondHighest+thirdHighest);
    }

    public void getHighest() {
        Collections.sort(elves);
        highestCalories = elves.get(elves.size()-1);
        System.out.println(highestCalories);
    }
}
