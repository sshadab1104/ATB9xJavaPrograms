package Core_Java_Revision.Day_4;

public class Lab040_MinInArray {
    public static void main(String[] args) {
        int[] arr = {10,4,78,189,87,45,16,101};
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min)
                min = arr[i];
        }
        System.out.println(min);
    }
}
