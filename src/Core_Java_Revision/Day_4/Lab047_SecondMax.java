package Core_Java_Revision.Day_4;

public class Lab047_SecondMax {
    public static void main(String[] args) {
        int[] arr = {10,4,78,45,15,36,40,7};
        int max= Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]> max) {
                smax = max;
                max = arr[i];
            } else if (arr[i]>smax && arr[i]!=max) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
