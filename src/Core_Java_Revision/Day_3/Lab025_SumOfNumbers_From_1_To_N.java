package Core_Java_Revision.Day_3;

import java.util.Scanner;

public class Lab025_SumOfNumbers_From_1_To_N {
    public static void main(String[] args) {
        // Program 5: Sum of numbers from 1 to N
        // Input N
        // Calculate sum using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
