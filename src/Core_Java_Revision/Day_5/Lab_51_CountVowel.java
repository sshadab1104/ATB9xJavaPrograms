package Core_Java_Revision.Day_5;

public class Lab_51_CountVowel {
    public static void main(String[] args) {
        // Program 2: Count Vowels
        // Count number of vowels in a string
        String name = "Shadab";
        int count = 0;
        for (int i=0; i<name.length(); i++){
            if (i=='a' || i=='e' || i== 'i' || i== 'o' || i=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
