package Core_Java_Revision.Day_1;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        // Average of 3 Numbers
        // Input 3 numbers and Print average

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = sc.nextInt();
        System.out.println("Enter Second number:");
        int b = sc.nextInt();
        System.out.println("Enter Third number:");
        int c = sc.nextInt();

        double avg = (a + b + c) / 3.0;
        System.out.println("Average: " + avg);
    }
}
