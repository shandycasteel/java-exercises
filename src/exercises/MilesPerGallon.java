package exercises;

import java.util.Scanner;

/**
 * Created by Shandy Casteel on 7/29/19
 *
 * Numeric types:
 * Write a program that asks a user for the number of miles they have driven and the amount of gas they've consumed
 * (in gallons), and print their miles-per-gallon.
 */

public class MilesPerGallon {
    public static void main(String[] args) {
        double milesDriven, gasConsumed, milesPerGallon;

        Scanner in = new Scanner(System.in);

        System.out.print("How many miles did you drive? ");
        milesDriven = in.nextDouble();

        if (milesDriven % 1 != 0) {

            System.out.print("How much gas (in gallons) did you use? ");
            gasConsumed = in.nextDouble();

            milesPerGallon = milesDriven / gasConsumed;

            System.out.println("\nThat comes out to " + milesPerGallon + " miles per gallon for that trip.");

        }
    }

}
