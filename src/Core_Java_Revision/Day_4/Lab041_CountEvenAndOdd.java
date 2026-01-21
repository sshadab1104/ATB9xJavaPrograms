package Core_Java_Revision.Day_4;

public class Lab041_CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {10,4,78,189,87,45,16,101};
        int evenCount = 0, oddCount = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
