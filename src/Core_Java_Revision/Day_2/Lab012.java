package Core_Java_Revision.Day_2;
import java.util.Scanner;
public class Lab012 {
    public static void main(String[] args) {
        // Program 2: Positive, Negative or Zero
        // Input a number Check if it is positive, negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println(n+" is Negative number.");
        } else if (n==0) {
            System.out.println(n+" is Zero");
        } else {
            System.out.println(n+" is Positive number.");
        }
    }
}
