package Core_Java_Revision.Day_1;

import java.util.Scanner;

public class Lab010_Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        // Program 6: Celsius to Fahrenheit
        // Input temperature in Celsius and Convert to Fahrenheit
        Scanner sc = new Scanner(System.in);

        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;

        System.out.println("Fahrenheit: " + f);
    }
}
