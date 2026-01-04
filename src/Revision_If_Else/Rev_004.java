package Revision_If_Else;
import java.util.Scanner;
public class Rev_004 {
    // Q. Take Integer input and print absolute value of that Integer.
    // absolute value is: |-7| = 7, |8| = 8
    // means any negative number convert into in positive.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n<0){
            n =n*(-1);
        }
        System.out.println(n);
    }
}
