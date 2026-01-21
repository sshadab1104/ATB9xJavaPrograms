package Core_Java_Revision.Day_4;

public class Lab044_AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {10,45,12};
        double sum = 0;
        for (int i=0; i< arr.length; i++){
            sum = sum+arr[i];
        }
        double avg = sum/ arr.length;
        System.out.println(avg);
    }
}
