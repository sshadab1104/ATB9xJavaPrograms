package Core_Java_Revision.Day_4;

public class Lab036_Declare_Print_Array {
    public static void main(String[] args) {
        // there are two type of declaration in array
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        System.out.println(arr.length);

        int[] arr1 = {5,10,15,20};
        System.out.println(arr1.length);
    }
}
