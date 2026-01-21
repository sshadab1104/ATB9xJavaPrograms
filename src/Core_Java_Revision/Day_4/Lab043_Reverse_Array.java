package Core_Java_Revision.Day_4;

public class Lab043_Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {10,20,25,26,45,78,98,50,12,15};
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
