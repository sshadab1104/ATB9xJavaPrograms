package Core_Java_Revision.Day_2;

import java.util.Scanner;

public class Lab017 {
    public static void main(String[] args) {
        // Program 7: Vowel or Consonant
        // Input a character and check if it is vowel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch =  sc.next().toLowerCase().charAt(0);

        if(ch =='a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u'){
            System.out.println(ch+" is vowel");
        } else {
            System.out.println(ch+" is consonant");
        }
    }
}
