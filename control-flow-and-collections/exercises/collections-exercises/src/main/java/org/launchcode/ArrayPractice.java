package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] integerArray = {1, 1, 2, 3, 5, 8};


        for (int i=0;i < integerArray.length ; i++)
        {
//            System.out.println(integerArray[i]);
            if (integerArray[i] % 2  != 0)
            {
                System.out.println(integerArray[i]);
            }

        }

        String foxInSocks = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        //Split on space
//        String[] sArray = foxInSocks.split(" ");
//        for ( String s : sArray) {
//            System.out.println(s);
//        }
//
//        System.out.println(Arrays.toString(sArray));

        //split on period
        String[] setenceArr= foxInSocks.split("\\.");

        for (String s: setenceArr)
        {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(setenceArr));

    }
}
