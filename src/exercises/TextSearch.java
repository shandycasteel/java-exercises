package exercises;

import java.util.Scanner;

/**
 * Strings:
 * The first sentence of Alice's Adventures in Wonderland is below. Store this sentence in a string, and then prompt
 * the user for a term to search for within this string. Print whether or not the search term was found. See if you
 * can make the search case-insensitive, so that searching for "alice", for example, prints true.
 */

public class TextSearch {
    public static void main(String[] args) {

        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice" +
                "'without pictures or conversation?'";

        String  searchTerm;

        Scanner in = new Scanner(System.in);

        System.out.print("What word would you like to search for? ");
        searchTerm = in.next().toLowerCase();

        if (story.toLowerCase().contains(searchTerm)) {
            System.out.println("\nWe found your word!");
        } else {
            System.out.println("\nYour word is not in the selected text.");
        }

    }
}