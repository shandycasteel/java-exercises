package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentID;

        System.out.println("Enter the student's ID (or press RETURN when done): ");

        do {

            System.out.print("Student ID: ");
            newStudentID = in.nextInt();

            if (!in.hasNextInt()) {
                System.out.print("Student Name: ");
                String newStudentName = in.nextLine();
                students.put(newStudentID, newStudentName);

                in.nextLine();
            }

        } while(!in.hasNextInt());

        System.out.println("Class roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + "\t" + student.getValue());

        }
    }
}
