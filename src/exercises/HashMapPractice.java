package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer idNumber;
        String student;

        System.out.println("Please enter the students ID number (enter), then name. (Press Enter twice on ID to finish) ");

        do {
            System.out.println("ID Number:");
            idNumber = (int) input.nextDouble();

            if (!idNumber.equals("")){
                System.out.println("Student:");
                student = input.nextLine();
                students.put(idNumber, student);

                input.nextLine();
            }
        } while (!idNumber.equals(""));

        input.close();

        System.out.println("\nstudents");


    }
}
