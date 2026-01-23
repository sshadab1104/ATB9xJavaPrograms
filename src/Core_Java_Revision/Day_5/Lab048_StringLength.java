package Core_Java_Revision.Day_5;

import java.util.Scanner;

public class Lab048_StringLength {
    public static void main(String[] args) {
        String name = "shadab";
        System.out.println(name.length());
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for(char c : str.toCharArray())
            count++;

        System.out.println("Length = " + count);
    }
}
