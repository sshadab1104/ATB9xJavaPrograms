package Core_Java_Revision.Day_1;

import java.util.Scanner;

public class Lab004_SimpleCalculator {
    public static void main(String[] args) {
        // Practice 4: Simple Calculator
        // Take two numbers from user and print:
        //Addition, Subtraction, Multiplication, Division
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();
        System.out.println("Addition: "+ (n1+n2));
        System.out.println("Subtraction: "+ (n1-n2));
        System.out.println("Multiplication: "+ (n1*n2));
        System.out.println("Division: "+ (n1/n2));
        System.out.println("Modulus: "+ (n1%n2));
        sc.close();
    }
}
