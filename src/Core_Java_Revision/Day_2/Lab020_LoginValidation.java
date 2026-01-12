package Core_Java_Revision.Day_2;

import java.util.Scanner;

public class Lab020_LoginValidation {
    public static void main(String[] args) {
        // Program 10: Login Validation
        // Input username and password
        // If username = "admin" and password = "1234"
        // Print Login Successful
        // Else Login Failed

            Scanner sc = new Scanner(System.in);
            String user = sc.next();
            String pass = sc.next();
            if(user.equals("admin") && pass.equals("1234")){
                System.out.println("Login Successful");
            }else {
                System.out.println("Login Failed");
            }
    }
}
