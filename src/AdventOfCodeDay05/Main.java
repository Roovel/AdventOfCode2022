package AdventOfCodeDay05;

public class Main {

    public static void main(String[] args) {

        Shipment shipment = new Shipment();

        Crane crane = new Crane();
        crane.getInstructions("input05instructions.txt");

        Crate first = new Crate("WMLF", 1);
        Crate second = new Crate("BZVMF", 2);
        Crate third = new Crate("HVRSLQ", 3);
        Crate fourth = new Crate("FSVQPMTJ", 4);
        Crate fifth = new Crate("LSW", 5);
        Crate sixth = new Crate("FVPMRJW", 6);
        Crate seventh = new Crate("JQCPNRF", 7);
        Crate eighth = new Crate("VHPSZWRB", 8);
        Crate ninth = new Crate("BMJCGHZW", 9);

        first.printCargo();
        second.printCargo();
        third.printCargo();
        fourth.printCargo();
        fifth.printCargo();
        sixth.printCargo();
        seventh.printCargo();
        eighth.printCargo();
        ninth.printCargo();
        System.out.println("");

        shipment.addCrate(first);
        shipment.addCrate(second);
        shipment.addCrate(third);
        shipment.addCrate(fourth);
        shipment.addCrate(fifth);
        shipment.addCrate(sixth);
        shipment.addCrate(seventh);
        shipment.addCrate(eighth);
        shipment.addCrate(ninth);

        String transferrableCargo = "";
        int amount;
        int from;
        int to;

        // Solution for part 1
        /*for (int i = 0; i < crane.amount.size(); i++) {
            amount = crane.amount.get(i);
            from = crane.from.get(i);
            to = crane.to.get(i);

            if (from == 1) {
                if (to == 2) {
                    second.addCargo(amount, first);
                }
                if (to == 3) {
                    third.addCargo(amount, first);
                }
                if (to == 4) {
                    fourth.addCargo(amount, first);
                }
                if (to == 5) {
                    fifth.addCargo(amount, first);
                }
                if (to == 6) {
                    sixth.addCargo(amount, first);
                }
                if (to == 7) {
                    seventh.addCargo(amount, first);
                }
                if (to == 8) {
                    eighth.addCargo(amount, first);
                }
                if (to == 9) {
                    ninth.addCargo(amount, first);
                }
                first.removeCargo(amount);
            }
            if (from == 2) {
                if (to == 1) {
                    first.addCargo(amount, second);
                }
                if (to == 3) {
                    third.addCargo(amount, second);
                }
                if (to == 4) {
                    fourth.addCargo(amount, second);
                }
                if (to == 5) {
                    fifth.addCargo(amount, second);
                }
                if (to == 6) {
                    sixth.addCargo(amount, second);
                }
                if (to == 7) {
                    seventh.addCargo(amount, second);
                }
                if (to == 8) {
                    eighth.addCargo(amount, second);
                }
                if (to == 9) {
                    ninth.addCargo(amount, second);
                }
                second.removeCargo(amount);
            }
            if (from == 3) {
                if (to == 2) {
                    second.addCargo(amount, third);
                }
                if (to == 1) {
                    first.addCargo(amount, third);
                }
                if (to == 4) {
                    fourth.addCargo(amount, third);
                }
                if (to == 5) {
                    fifth.addCargo(amount, third);
                }
                if (to == 6) {
                    sixth.addCargo(amount, third);
                }
                if (to == 7) {
                    seventh.addCargo(amount, third);
                }
                if (to == 8) {
                    eighth.addCargo(amount, third);
                }
                if (to == 9) {
                    ninth.addCargo(amount, third);
                }
                third.removeCargo(amount);
            }
            if (from == 4) {
                if (to == 2) {
                    second.addCargo(amount, fourth);
                }
                if (to == 3) {
                    third.addCargo(amount, fourth);
                }
                if (to == 1) {
                    first.addCargo(amount, fourth);
                }
                if (to == 5) {
                    fifth.addCargo(amount, fourth);
                }
                if (to == 6) {
                    sixth.addCargo(amount, fourth);
                }
                if (to == 7) {
                    seventh.addCargo(amount, fourth);
                }
                if (to == 8) {
                    eighth.addCargo(amount, fourth);
                }
                if (to == 9) {
                    ninth.addCargo(amount, fourth);
                }
                fourth.removeCargo(amount);
            }
            if (from == 5) {
                if (to == 2) {
                    second.addCargo(amount, fifth);
                }
                if (to == 3) {
                    third.addCargo(amount, fifth);
                }
                if (to == 4) {
                    fourth.addCargo(amount, fifth);
                }
                if (to == 1) {
                    first.addCargo(amount, fifth);
                }
                if (to == 6) {
                    sixth.addCargo(amount, fifth);
                }
                if (to == 7) {
                    seventh.addCargo(amount, fifth);
                }
                if (to == 8) {
                    eighth.addCargo(amount, fifth);
                }
                if (to == 9) {
                    ninth.addCargo(amount, fifth);
                }
                fifth.removeCargo(amount);
            }
            if (from == 6) {
                if (to == 2) {
                    second.addCargo(amount, sixth);
                }
                if (to == 3) {
                    third.addCargo(amount, sixth);
                }
                if (to == 4) {
                    fourth.addCargo(amount, sixth);
                }
                if (to == 5) {
                    fifth.addCargo(amount, sixth);
                }
                if (to == 1) {
                    first.addCargo(amount, sixth);
                }
                if (to == 7) {
                    seventh.addCargo(amount, sixth);
                }
                if (to == 8) {
                    eighth.addCargo(amount, sixth);
                }
                if (to == 9) {
                    ninth.addCargo(amount, sixth);
                }
                sixth.removeCargo(amount);
            }
            if (from == 7) {
                if (to == 2) {
                    second.addCargo(amount, seventh);
                }
                if (to == 3) {
                    third.addCargo(amount, seventh);
                }
                if (to == 4) {
                    fourth.addCargo(amount, seventh);
                }
                if (to == 5) {
                    fifth.addCargo(amount, seventh);
                }
                if (to == 6) {
                    sixth.addCargo(amount, seventh);
                }
                if (to == 1) {
                    first.addCargo(amount, seventh);
                }
                if (to == 8) {
                    eighth.addCargo(amount, seventh);
                }
                if (to == 9) {
                    ninth.addCargo(amount, seventh);
                }
                seventh.removeCargo(amount);
            }
            if (from == 8) {
                if (to == 2) {
                    second.addCargo(amount, eighth);
                }
                if (to == 3) {
                    third.addCargo(amount, eighth);
                }
                if (to == 4) {
                    fourth.addCargo(amount, eighth);
                }
                if (to == 5) {
                    fifth.addCargo(amount, eighth);
                }
                if (to == 6) {
                    sixth.addCargo(amount, eighth);
                }
                if (to == 7) {
                    seventh.addCargo(amount, eighth);
                }
                if (to == 1) {
                    first.addCargo(amount, eighth);
                }
                if (to == 9) {
                    ninth.addCargo(amount, eighth);
                }
                eighth.removeCargo(amount);
            }
            if (from == 9) {
                if (to == 2) {
                    second.addCargo(amount, ninth);
                }
                if (to == 3) {
                    third.addCargo(amount, ninth);
                }
                if (to == 4) {
                    fourth.addCargo(amount, ninth);
                }
                if (to == 5) {
                    fifth.addCargo(amount, ninth);
                }
                if (to == 6) {
                    sixth.addCargo(amount, ninth);
                }
                if (to == 7) {
                    seventh.addCargo(amount, ninth);
                }
                if (to == 8) {
                    eighth.addCargo(amount, ninth);
                }
                if (to == 1) {
                    first.addCargo(amount, ninth);
                }
                ninth.removeCargo(amount);
            }
        }*/ 

        //Solution for part 2
        for (int i = 0; i < crane.amount.size(); i++) {
            amount = crane.amount.get(i);
            from = crane.from.get(i);
            to = crane.to.get(i);

            if (from == 1) {
                if (to == 2) {
                    second.addCargoStack(amount, first);
                }
                if (to == 3) {
                    third.addCargoStack(amount, first);
                }
                if (to == 4) {
                    fourth.addCargoStack(amount, first);
                }
                if (to == 5) {
                    fifth.addCargoStack(amount, first);
                }
                if (to == 6) {
                    sixth.addCargoStack(amount, first);
                }
                if (to == 7) {
                    seventh.addCargoStack(amount, first);
                }
                if (to == 8) {
                    eighth.addCargoStack(amount, first);
                }
                if (to == 9) {
                    ninth.addCargoStack(amount, first);
                }
                first.removeCargo(amount);
            }
            if (from == 2) {
                if (to == 1) {
                    first.addCargoStack(amount, second);
                }
                if (to == 3) {
                    third.addCargoStack(amount, second);
                }
                if (to == 4) {
                    fourth.addCargoStack(amount, second);
                }
                if (to == 5) {
                    fifth.addCargoStack(amount, second);
                }
                if (to == 6) {
                    sixth.addCargoStack(amount, second);
                }
                if (to == 7) {
                    seventh.addCargoStack(amount, second);
                }
                if (to == 8) {
                    eighth.addCargoStack(amount, second);
                }
                if (to == 9) {
                    ninth.addCargoStack(amount, second);
                }
                second.removeCargo(amount);
            }
            if (from == 3) {
                if (to == 2) {
                    second.addCargoStack(amount, third);
                }
                if (to == 1) {
                    first.addCargoStack(amount, third);
                }
                if (to == 4) {
                    fourth.addCargoStack(amount, third);
                }
                if (to == 5) {
                    fifth.addCargoStack(amount, third);
                }
                if (to == 6) {
                    sixth.addCargoStack(amount, third);
                }
                if (to == 7) {
                    seventh.addCargoStack(amount, third);
                }
                if (to == 8) {
                    eighth.addCargoStack(amount, third);
                }
                if (to == 9) {
                    ninth.addCargoStack(amount, third);
                }
                third.removeCargo(amount);
            }
            if (from == 4) {
                if (to == 2) {
                    second.addCargoStack(amount, fourth);
                }
                if (to == 3) {
                    third.addCargoStack(amount, fourth);
                }
                if (to == 1) {
                    first.addCargoStack(amount, fourth);
                }
                if (to == 5) {
                    fifth.addCargoStack(amount, fourth);
                }
                if (to == 6) {
                    sixth.addCargoStack(amount, fourth);
                }
                if (to == 7) {
                    seventh.addCargoStack(amount, fourth);
                }
                if (to == 8) {
                    eighth.addCargoStack(amount, fourth);
                }
                if (to == 9) {
                    ninth.addCargoStack(amount, fourth);
                }
                fourth.removeCargo(amount);
            }
            if (from == 5) {
                if (to == 2) {
                    second.addCargoStack(amount, fifth);
                }
                if (to == 3) {
                    third.addCargoStack(amount, fifth);
                }
                if (to == 4) {
                    fourth.addCargoStack(amount, fifth);
                }
                if (to == 1) {
                    first.addCargoStack(amount, fifth);
                }
                if (to == 6) {
                    sixth.addCargoStack(amount, fifth);
                }
                if (to == 7) {
                    seventh.addCargoStack(amount, fifth);
                }
                if (to == 8) {
                    eighth.addCargoStack(amount, fifth);
                }
                if (to == 9) {
                    ninth.addCargoStack(amount, fifth);
                }
                fifth.removeCargo(amount);
            }
            if (from == 6) {
                if (to == 2) {
                    second.addCargoStack(amount, sixth);
                }
                if (to == 3) {
                    third.addCargoStack(amount, sixth);
                }
                if (to == 4) {
                    fourth.addCargoStack(amount, sixth);
                }
                if (to == 5) {
                    fifth.addCargoStack(amount, sixth);
                }
                if (to == 1) {
                    first.addCargoStack(amount, sixth);
                }
                if (to == 7) {
                    seventh.addCargoStack(amount, sixth);
                }
                if (to == 8) {
                    eighth.addCargoStack(amount, sixth);
                }
                if (to == 9) {
                    ninth.addCargoStack(amount, sixth);
                }
                sixth.removeCargo(amount);
            }
            if (from == 7) {
                if (to == 2) {
                    second.addCargoStack(amount, seventh);
                }
                if (to == 3) {
                    third.addCargoStack(amount, seventh);
                }
                if (to == 4) {
                    fourth.addCargoStack(amount, seventh);
                }
                if (to == 5) {
                    fifth.addCargoStack(amount, seventh);
                }
                if (to == 6) {
                    sixth.addCargoStack(amount, seventh);
                }
                if (to == 1) {
                    first.addCargoStack(amount, seventh);
                }
                if (to == 8) {
                    eighth.addCargoStack(amount, seventh);
                }
                if (to == 9) {
                    ninth.addCargoStack(amount, seventh);
                }
                seventh.removeCargo(amount);
            }
            if (from == 8) {
                if (to == 2) {
                    second.addCargoStack(amount, eighth);
                }
                if (to == 3) {
                    third.addCargoStack(amount, eighth);
                }
                if (to == 4) {
                    fourth.addCargoStack(amount, eighth);
                }
                if (to == 5) {
                    fifth.addCargoStack(amount, eighth);
                }
                if (to == 6) {
                    sixth.addCargoStack(amount, eighth);
                }
                if (to == 7) {
                    seventh.addCargoStack(amount, eighth);
                }
                if (to == 1) {
                    first.addCargoStack(amount, eighth);
                }
                if (to == 9) {
                    ninth.addCargoStack(amount, eighth);
                }
                eighth.removeCargo(amount);
            }
            if (from == 9) {
                if (to == 2) {
                    second.addCargoStack(amount, ninth);
                }
                if (to == 3) {
                    third.addCargoStack(amount, ninth);
                }
                if (to == 4) {
                    fourth.addCargoStack(amount, ninth);
                }
                if (to == 5) {
                    fifth.addCargoStack(amount, ninth);
                }
                if (to == 6) {
                    sixth.addCargoStack(amount, ninth);
                }
                if (to == 7) {
                    seventh.addCargoStack(amount, ninth);
                }
                if (to == 8) {
                    eighth.addCargoStack(amount, ninth);
                }
                if (to == 1) {
                    first.addCargoStack(amount, ninth);
                }
                ninth.removeCargo(amount);
            }
        }


        first.printCargo();
        second.printCargo();
        third.printCargo();
        fourth.printCargo();
        fifth.printCargo();
        sixth.printCargo();
        seventh.printCargo();
        eighth.printCargo();
        ninth.printCargo();
        //System.out.println("");


        //first.printCargo();
        //second.printCargo();
        //third.printCargo();
        //fourth.printCargo();
        //fifth.printCargo();
        //sixth.printCargo();
        //seventh.printCargo();
        //eighth.printCargo();
        //ninth.printCargo();
        



    }
}