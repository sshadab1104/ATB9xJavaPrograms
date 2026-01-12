package InterviewQue;

import java.util.Scanner;

public class PracticeCode {
    public static void main(String[] args) {
        // some of number 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0;
        int org_n =n;
        while(n>0){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n = n/10;
        }
        if (rev==org_n) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
