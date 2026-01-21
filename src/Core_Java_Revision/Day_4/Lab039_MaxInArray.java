package Core_Java_Revision.Day_4;

public class Lab039_MaxInArray {
    public static void main(String[] args) {
        int[] arr = {10,45,78,189,87,45,16,101};
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
