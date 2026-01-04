package Revision_If_Else;

import java.util.Scanner;

public class Rev_006 {
    // Take positive integer input and  tell if it is a three digit or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println(n+": is Three digit number");
        }
        else {
            System.out.println(n+": is not Three digit number");
        }
    }

}
