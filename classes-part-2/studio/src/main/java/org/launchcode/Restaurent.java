package org.launchcode;

public class Restaurent {
    public Restaurent() {
    }

    public static void main(String[] args) {
        org.launchcode.MenuItem burger = new org.launchcode.MenuItem(10.0, "burger", "main course", true);
        System.out.println(burger);
    }
}