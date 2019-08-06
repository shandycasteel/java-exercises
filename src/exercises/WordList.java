package exercises;

import java.util.ArrayList;


public class WordList {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("give");
        words.add("glass");
        words.add("go");
        words.add("goal");
        words.add("good");
        words.add("government");
        words.add("great");
        words.add("green");
        words.add("ground");
        words.add("group");
        words.add("grow");
        words.add("guess");

        System.out.println("Here are the words from your list that have exactly five letters:\n");
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }

}

}
