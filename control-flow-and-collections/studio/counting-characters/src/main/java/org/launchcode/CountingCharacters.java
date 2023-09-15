package org.launchcode;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;  // Import this class to handle errors

public class CountingCharacters {

    public static void main(String[] args) throws FileNotFoundException {
//
//        String sentence= "If the product of two terms is zero then common sense says at least one of" +
//                " the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics into a " +
//                "form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";
//        ClassLoader classLoader = CountingCharacters.class.getClassLoader();
////        File file = new File(classLoader.getResource("/control-flow-and-collections/studio/counting-characters/src/main/resources/sentence.txt"));
//        File myObj = new File("/src/main/resources/sentence.txt");
//        InputStream inputStream = new FileInputStream(myObj);
//        //
//
////            InputStream is= CountingCharacters.class.getResourceAsStream("sentence.txt");
//        String data ="";
//                Scanner myReader = new Scanner(inputStream);
//        while (myReader.hasNextLine()) {
//           data=myReader.nextLine();
//            System.out.println(data);
//        }
//        myReader.close();
//

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String userInput = input.nextLine();
        String sentenceOld = userInput.toLowerCase();
        String sentence = sentenceOld.replaceAll("[^a-zA-Z]", "");
//        char[] charArray = sentence.toCharArray();


        //ANOTHER WAY :
       /* Boolean str = wordChar.containsKey(someChar);

        if(str && Character.isLetter(someChar)) {
            int oldNum = wordChar.get(someChar);
            int newNum = oldNum+1;

            wordChar.replace(someChar, oldNum, newNum);
        }
        else if (Character.isLetter(someChar)) {
            wordChar.put(someChar,1);
        } */
        char[] characters= sentence.toCharArray();

//        System.out.println(Arrays.toString(characters));

        HashMap<Character,Integer> charCountMap = new HashMap<>();

        for( char c : characters)
        {
            if(charCountMap.containsKey(c)){
//
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c,1);
            }

        }
       for(Map.Entry<Character,Integer> ckey : charCountMap.entrySet())
       {
           System.out.println(ckey.getKey() + ": " + ckey.getValue());
       }

    }
}

