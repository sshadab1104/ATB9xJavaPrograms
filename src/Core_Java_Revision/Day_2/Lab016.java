package Core_Java_Revision.Day_2;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {
        // Program 6: Grade Calculator
        // Input marks (0-100)
        // Print grade:
        // 90+ → A, 75-89 → B, 50-74 → C, Below 50 → Fail

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}
