package Core_Java_Revision.Day_3;

import java.util.Scanner;

public class Lab032_PrimeNumberCheck {
    public static void main(String[] args) {
        // Program 12: Prime number check
        // Input number and Check if prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num <=1) {
            isPrime = false;
        }
        for (int i=2; i<=num/2; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        } if (isPrime){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not Prime Number");
        }
    }
}
