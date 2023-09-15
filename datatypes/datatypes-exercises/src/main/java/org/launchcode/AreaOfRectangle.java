package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter LENGTH of The rectangle: ");

        Double length= input.nextDouble();


        System.out.println("Enter WIDTH of The rectangle: ");

        Double width= input.nextDouble();

        Double areaRect = length * width;

        System.out.println("Area of the rectangle is: " + areaRect);
        input.close();
    }
}
