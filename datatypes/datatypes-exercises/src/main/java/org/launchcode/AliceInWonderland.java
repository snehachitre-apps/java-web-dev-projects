package org.launchcode;

import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {

        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?'";


        Scanner input= new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word= input.next();

        if (alice.contains(word))
        {
//            System.out.println("Index:" + );
//            System.out.printf("Length: " + word.length());
            System.out.println("Your word appears at index "  + alice.indexOf(word) + " and is " +  word.length() + " characters long.");
            String newAlice= alice.replace(word, "");
            System.out.println(newAlice);

        }
        else {
            System.out.println(word + " is not in the String");
        }

        input.close();
    }
}
