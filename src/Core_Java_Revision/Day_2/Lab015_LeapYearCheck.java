package Core_Java_Revision.Day_2;

import java.util.Scanner;

public class Lab015_LeapYearCheck {
    public static void main(String[] args) {
        // Program 5: Leap Year Check
        // Input year check if it is a leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");

    }
}
