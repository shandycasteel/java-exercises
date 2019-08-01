package exercises;

import java.util.Scanner;

/**
 * Created by Shandy Casteel on 7/28/19
 *
 * Input/output:
 * Modify your "Hello, World" program to prompt the user for their name, and greet them by name.
 */


public class HelloThere {
    public static void main(String[] args) {
        String name;

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = in.nextLine();

        System.out.println("\nHello, " + name + ", welcome to Unit 2: Back-End Java!");
    }
}