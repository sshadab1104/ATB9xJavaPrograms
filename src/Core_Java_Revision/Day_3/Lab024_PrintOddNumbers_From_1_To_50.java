package Core_Java_Revision.Day_3;

public class Lab024_PrintOddNumbers_From_1_To_50 {
    public static void main(String[] args) {
        // Program 4: Print odd numbers from 1 to 50
        // Use while loop

        int i=1;
        while (i<50){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}
