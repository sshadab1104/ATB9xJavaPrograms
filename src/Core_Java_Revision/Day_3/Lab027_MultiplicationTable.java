package Core_Java_Revision.Day_3;

import java.util.Scanner;

public class Lab027_MultiplicationTable {
    public static void main(String[] args) {
        // Program 7: Multiplication table
        // Input a number
        // Print its table (1 to 10)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum = n*i;
            System.out.println(n+" * "+i+ " = "+sum);
        }
    }
}
