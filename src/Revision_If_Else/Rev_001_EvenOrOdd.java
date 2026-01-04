package Revision_If_Else;

import java.util.Scanner;

public class Rev_001_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" : is Even number");
        }
        else {
            System.out.println(num+" is Odd number");
        }
    }
}
