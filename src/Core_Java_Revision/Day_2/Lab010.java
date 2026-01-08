package Core_Java_Revision.Day_2;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
        // Program 1: Even or Odd
        // Input a number, Print whether number is Even or Odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is Even Number");
        }
        else {
            System.out.println(n+" is Odd Number");
        }
    }
}
