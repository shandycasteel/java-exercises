package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
// import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CharacterCounter {
    public static void main(String[] args) throws IOException {

        /*
         * String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
         * "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit " +
         * "metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec " +
         * "velit non ligula efficitur luctus.";
         */

        String myString = new String(Files.readAllBytes(Paths.get("/Users/shandy/lc101/java-exercises/resources/studio.txt")));


        /*
         * Scanner in = new Scanner(System.in);
         * System.out.println("Please enter some text here:");
         * String myString = in.nextLine();
         */

        char[] charactersInString = myString.toLowerCase().toCharArray();

        Map<Character, Integer> characters = new HashMap<>();

        for (char character : charactersInString) {
            if (character >= 'a' && character <= 'z') if (!characters.containsKey(character)) {
                characters.put(character, 1);
            } else {
                int charCount = characters.get(character) + 1;
                characters.put(character, charCount);
            }
        }

        for (Map.Entry<Character, Integer> eachCharacter : characters.entrySet()) {
            System.out.println(eachCharacter.getKey() + " : " + eachCharacter.getValue());
        }

    }

}