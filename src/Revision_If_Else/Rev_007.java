package Revision_If_Else;

import java.util.Scanner;

public class Rev_007 {
    public static void main(String[] args) {
        // Take input and tell if it is divisible by 5 and 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("Number is divisible by 5 and 3");
        }
        else {
            System.out.println("Number is not divisible by 5 and 3");
        }
    }
}
