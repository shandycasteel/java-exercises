package exercises;

import java.util.Scanner;

/**
 * Created by Shandy Casteel on 7/28/19
 *
 * Numeric types:
 * Write a program to calculate the area of a rectangle and print the answer to the console. You should prompt the user
 * for the dimensions. (What data types should the dimensions be?)
 */


public class RectangleArea {
    public static void main(String[] args) {
        double rectWidth, rectLength;

        Scanner in = new Scanner(System.in);

        System.out.print("What's the width of your rectangle? ");
        rectWidth = in.nextDouble();

        System.out.print("What's the length of your rectangle? ");
        rectLength = in.nextDouble();

        System.out.println("\nThe area of your rectangle is: " + (rectWidth * rectLength) + " (of whatever unit of measurement you had in mind)!");

    }
}
