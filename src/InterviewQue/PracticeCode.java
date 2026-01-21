package InterviewQue;

import java.util.Scanner;

public class PracticeCode {
    public static void main(String[] args) {
        int[] arr = {40,48,79,45,62,4,5,11,7,};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i: arr){
            if (max<i){
                max = i;
            }
                if (smax<i && i!=max){
                    smax = i;
                }
            }
        System.out.println(smax);
    }
}
