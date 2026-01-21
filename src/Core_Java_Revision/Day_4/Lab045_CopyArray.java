package Core_Java_Revision.Day_4;

public class Lab045_CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = new int[arr1.length];
        for (int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        for (int i: arr2){
            System.out.print(i+" ");
        }
    }
}
