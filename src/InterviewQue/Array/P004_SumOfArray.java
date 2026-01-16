package InterviewQue.Array;

import java.util.Scanner;

public class P004_SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        System.out.println("Enter array elements");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            sum = sum+arr[i];
        }
        System.out.println(sum);

    }
}
