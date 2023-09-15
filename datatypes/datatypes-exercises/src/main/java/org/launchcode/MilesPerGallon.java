package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter amount of the miles you have driven : ");


        Integer miles= input.nextInt();

        System.out.println("Enter gas consumed in gallons: ");

        Integer gallons= input.nextInt();

        Double mileage = (double) miles / gallons;

        System.out.println("Your miles per gallons is : " + mileage);
        input.close();
    }
}
