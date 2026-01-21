package InterviewQue.Array;

import java.util.Scanner;

public class P001 {
    public static void main(String[] args) {
        int[] arr = {10,45,41,48,42,15};
        int even = 0, odd = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]%2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even count is: "+even);
        System.out.println("Odd count is: "+odd);


    }
}
