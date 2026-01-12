package Core_Java_Revision.Day_3;

import java.util.Scanner;

public class Lab030_PalindromeNumber {
    public static void main(String[] args) {
        // Program 10: Check Palindrome number
        // Input number and check if palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int org_n = n;
        int rev = 0;
        while (n>0){
            int lastDigit = n%10;
            rev =  rev*10 + lastDigit;
            n = n/10;
        }
        if (rev == org_n){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not Palindrome");
        }sc.close();
    }
}
