package exercises;

import java.util.ArrayList;

/**
 * ArrayList:
 * Write a static method to find the sum of all the even numbers in a list. Within main, create a list with at least
 * 10 integers and call your method on the list.
 */

public class SumList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        numbers.add(21);
        numbers.add(22);

        int evenSum = 0, oddSum  = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("The sum of the even numbers in your list is: " + evenSum);
        System.out.println("Not that you  asked, but the sum of the odd numbers in your list is: " + oddSum);

    }
}
