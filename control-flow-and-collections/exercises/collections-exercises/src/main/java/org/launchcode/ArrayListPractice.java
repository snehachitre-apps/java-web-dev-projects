package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumElements(ArrayList<Integer> arrayList){
        int total=0;

        for (int i: arrayList)
        {
            if (i% 2 ==0)
            {
                total+=i;
            }
        }
        return total;
    }

    public static void printwords(ArrayList<String> arrayList, int letterCount){
//        int c=0;

        for (String word: arrayList)
        {
            if (word.length() ==letterCount)
            {
                System.out.println(word);
            }
        }
//        return ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("Sum of Even numbers in the Arraylist is: " + sumElements(arrayList));;

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("sneha", "sooriya", "jesvika", "Myraa", "sabdaksj"));
        //string from Array practice

        String foxInSocks = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        //removed commas and periods to get accurate word lengths
        List<String> myList = new ArrayList<String>(Arrays.asList(foxInSocks.replace(","," ").replace("."," ").split(" ")));
        //asking word length from user
        Scanner input= new Scanner(System.in);

        System.out.println("Enter word length:  ");
        int letterCount = input.nextInt();

        printwords(wordList,letterCount);
        printwords((ArrayList<String>) myList,letterCount);
    }
}
