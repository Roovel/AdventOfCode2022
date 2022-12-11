package AdventOfCodeDay05;

import java.util.ArrayList;

public class Shipment {

    ArrayList<Crate> shipment;

    public Shipment() {
        this.shipment = new ArrayList<>();
    }

    public int getCrateNumberFromShipment(int index) {
        return shipment.get(index).getCrateNumber();
    }

    public void addCrate(Crate crate) {
        this.shipment.add(crate);
    }

}
