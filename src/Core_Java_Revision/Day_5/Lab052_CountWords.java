package Core_Java_Revision.Day_5;

public class Lab052_CountWords {
    public static void main(String[] args) {
        String str = "I am learning Java";
        String[] words = str.trim().split("\\s+");
        System.out.println(words.length);
    }
}
