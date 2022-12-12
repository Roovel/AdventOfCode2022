package AdventOfCodeDay05;

import java.util.ArrayList;
import java.util.Arrays;

public class Crate {

    private ArrayList<String> crate;
    private int crateNumber;
    String transferrableCargo;

    public Crate(String cargo, int crateNumber) {
        this.crate = new ArrayList<>();
        this.crateNumber = crateNumber;

        String[] parts = cargo.split("");
        this.crate.addAll(Arrays.asList(parts));
    }

    public void addCargo(int amount, Crate crate) {
        transferrableCargo = "";

        for (int i = crate.getCrateSize() - 1; amount > 0; i--) {
            transferrableCargo = crate.getCrate(i);
            this.crate.add(transferrableCargo);
            amount--;
        }
    }

    public void addCargoStack(int amount, Crate crate) {
        transferrableCargo = "";

        if (amount == crate.getCrateSize()) {
            for (int i = 0; i < crate.getCrateSize(); i++) {
                transferrableCargo = crate.getCrate(i);
                this.crate.add(transferrableCargo);
        }
        } else {
                for (int i = crate.getCrateSize() - amount; i <= crate.getCrateSize() - 1; i++) {
                    transferrableCargo = crate.getCrate(i);
                    this.crate.add(transferrableCargo);
            }
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
        System.out.println(this.crateNumber + ": " + this.crate);
    }


    public int getCrateNumber() {
        return crateNumber;
    }
}
