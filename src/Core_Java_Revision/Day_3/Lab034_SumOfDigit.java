package Core_Java_Revision.Day_3;

import java.util.Scanner;

public class Lab034_SumOfDigit {
    public static void main(String[] args) {
        // Program 14: Sum of digits
        // Input number and Find sum of its digits
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        while (n>0){
            sum = sum + n %10;
            n /=10;
        }
        System.out.println(sum);
    }
}
