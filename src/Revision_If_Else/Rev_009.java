package Revision_If_Else;

import java.util.Scanner;

public class Rev_009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println("number divisible by 3 or 5");
            }
            System.out.println("not divisible");
        }
    }
}
