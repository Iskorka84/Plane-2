package org.test;

public class Plane {
    public static String modelName = "Airbus-320";
    private String[] passengers;

    public Plane(String[] passengers) {
        this.passengers = passengers;
    }
    public String[] getPassengers() {
            return passengers;
    }
}