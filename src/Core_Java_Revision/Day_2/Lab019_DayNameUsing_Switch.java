package Core_Java_Revision.Day_2;

import java.util.Scanner;

public class Lab019_DayNameUsing_Switch {
    public static void main(String[] args) {
        // Program 9: Day Name using switch
        // Input number (1-7) and Print day name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number (1-7)");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            case 7:
                System.out.println("Sunday"); break;
            default:
                System.out.println("Invalid Day input");
        }
    }
}
