package AdventOfCodeDay05;

import java.util.ArrayList;
import java.util.Arrays;

public class Crate {

    private ArrayList<String> crate;
    private int crateNumber;

    public Crate(String cargo, int crateNumber) {
        this.crate = new ArrayList<>();

        String[] parts = cargo.split("");
        this.crate.addAll(Arrays.asList(parts));
    }

    public void addCargo(int amount, Crate crate) {
        String transferrableCargo = "";

        for (int i = crate.getCrateSize() - 1; amount > 0; i--) {
            transferrableCargo = crate.getCrate(i);
            this.crate.add(transferrableCargo);
            amount--;
        }
    }

    public void removeCargo(int amount) {
        int initialCrateSize = crate.size();
        for (int i = crate.size() - 1; crate.size() > initialCrateSize - amount; i--) {
            crate.remove(i);
        }
    }

    public String getCrate(int index) {
        return this.crate.get(index);
    }

    public int getCrateSize() {
        return this.crate.size();
    }

    public void printCargo() {
        System.out.println(crate);
    }

    public int getCrateNumber() {
        return crateNumber;
    }
}
