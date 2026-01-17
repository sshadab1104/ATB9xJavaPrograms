package InterviewQue;

import java.util.Scanner;

public class PracticeCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] arr = {12,78,45,9,45,48,5,7};
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
