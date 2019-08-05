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

        int sum = 0;

        for (int i = 0; i <= numbers.size(); i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("The sum of the even numbers in your list is: " + sum);

    }
}
