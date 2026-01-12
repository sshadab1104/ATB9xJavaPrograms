package Core_Java_Revision.Day_3;

import java.util.Scanner;

public class Lab029_CountDigit {
    public static void main(String[] args) {
        // Program 9: Count digits in a number
        // Input number and count total digits

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        while (n>0){
            count++;
            n = n/10;
        }
        sc.close();
        System.out.println(count);
    }
}
