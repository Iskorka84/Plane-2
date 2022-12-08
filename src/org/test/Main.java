package org.test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Plane model: " + Plane.modelName);
        System.out.println("==================================");

        String[] namePassengers = new String[6];
        namePassengers[0] = "Alain Delon";
        namePassengers[1] = "Tom Cruise";
        namePassengers[2] = "Nicole Kidman";
        namePassengers[3] = "Brad Pitt";
        namePassengers[4] = "Jennifer Aniston";
        namePassengers[5] = "Elvis Presley";

        Plane airbus = new Plane(namePassengers);

        airbus.setPassengers(namePassengers);

        for (int i = 0; i < namePassengers.length; i++) {
            System.out.println(airbus.getPassengers()[i]);
        }

        System.out.println("");

        boolean famousPerson = false;
        for (int i = 0; i < airbus.getPassengers().length; i++){
            if (airbus.getPassengers()[i].equals("Alain Delon")){
                switchStatement("Alain Delon");
                famousPerson = true;
            }
            else if (airbus.getPassengers()[i].equals("Elvis Presley")){
                switchStatement("Elvis Presley");
                famousPerson = true;
            }
        }
        if (!famousPerson){
            switchStatement("Fail");
        }

    }

    public static void switchStatement(String switchString) {
        switch (switchString) {
            case "Alain Delon":
                System.out.println("Wow, Alain Delon is flying on our plane!");
                break;
            case "Elvis Presley":
                System.out.println("Wow, Elvis Presley is flying on our plane too!");
                break;
            default:
                System.out.println("There is no Alain Delon or Elvis Presley on our plane!");

        }
    }
}

