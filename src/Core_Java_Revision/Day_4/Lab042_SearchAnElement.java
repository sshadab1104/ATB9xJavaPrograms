package Core_Java_Revision.Day_4;

import java.util.Scanner;

public class Lab042_SearchAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        boolean flag = false;
        int[] arr = {10,20,25,26,45,78,98,50,12,15};
        for (int i=0; i<arr.length; i++){
            if (arr[i]==n) {
                flag = true;
            }
        } if (flag==true){
            System.out.println(n+": Is present in array");
        }
        else {
            System.out.println(n+": Is not present in array");
        }
    }
}
