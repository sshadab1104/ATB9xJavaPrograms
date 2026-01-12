package Core_Java_Revision.Day_3;

public class Lab028_ReverseNumber {
    public static void main(String[] args) {
        // Program 8: Reverse a number
        // Input number
        // Reverse it using while loop
        int n = 1234;
        int rev = 0;
        while (n!=0){
            int lastDigit = n%10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
