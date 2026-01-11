package Core_Java_Revision.Day_2;

import java.util.Scanner;

public class Lab013 {
    public static void main(String[] args) {
        // Program 3: Largest of Two Numbers
        // Input two numbers and Print the larger number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        if(n1==n2){
            System.out.println(n1+" is equal to "+n2);
        }else if (n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }else {
            System.out.println(n2+" is greater than "+n1);
        }
    }
}
