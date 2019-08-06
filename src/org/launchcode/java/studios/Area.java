package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius, area ;

        Scanner in = new Scanner(System.in);

       do {
           System.out.print("Enter a radius: ");
           radius = in.nextDouble();

           if (radius > 0) {
               area = Math.round(Math.PI * Math.pow(radius, 2) * 100) / 100.0;
               System.out.println("\nThe area of a circle of radius " + radius + " is: " + area);
           } else  {
               System.out.println("\nERROR: Your radius needs to be greater than 0.\n");
           }
       } while (radius <= 0);
    }
}