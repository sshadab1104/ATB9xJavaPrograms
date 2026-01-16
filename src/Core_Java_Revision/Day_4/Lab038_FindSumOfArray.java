package Core_Java_Revision.Day_4;

public class Lab038_FindSumOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,3,45,78,89,101};
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
