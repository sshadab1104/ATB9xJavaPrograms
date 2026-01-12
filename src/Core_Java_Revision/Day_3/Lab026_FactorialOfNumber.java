package Core_Java_Revision.Day_3;

import java.util.Scanner;

public class Lab026_FactorialOfNumber {
    public static void main(String[] args) {
        // Program 6: Factorial of a number
        // Input number
        // Calculate factorial using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact*i; // 1 = 1*1 1 / 1 = 1*2 2/ 2 = 2*3 6 / 6 = 6*4 24/ 24 = 24*5 120
        }
        System.out.println(fact);
    }
}
