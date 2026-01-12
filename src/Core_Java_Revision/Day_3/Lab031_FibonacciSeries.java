package Core_Java_Revision.Day_3;

import java.util.Scanner;

public class Lab031_FibonacciSeries {
    public static void main(String[] args) {
        // Program 11: Fibonacci series
        // Input N and Print Fibonacci series up to N terms
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a=0, b=1;
        for (int i=1; i<=n; i++){
            System.out.print(a+ " ");
            int c = a + b;
            a=b;
            b=c;
        }

    }
}
