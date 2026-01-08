package Core_Java_Revision.Day_1;

import java.util.Scanner;

public class Lab005 {
    public static void main(String[] args) {
        // Area of Rectangle
        // Input length and breadth
        // Print area and perimeter
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        System.out.println("Area of Rectangle is: "+(length*breadth));
        System.out.println("Perimeter of Rectangle is: "+2*(length+breadth) );
    }
}
