package Core_Java_Revision.Day_1;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
        // Practice 9: ASCII Value
        // Input a character and Print its ASCII value

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("ASCII value: "+ascii);
    }
}
