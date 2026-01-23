package Core_Java_Revision.Day_5;

public class Lab049_CountVowelAndConsonant {
    public static void main(String[] args) {
        // Program 2: Count Vowels and constant
        // Count number of vowels in a string
        String name = "Shadab";
        name = name.toLowerCase();
        int vowel = 0, constant =0;
        for (int i=0; i<name.length(); i++){
            char c = name.charAt(i);
            if (c=='a' || c=='e' || c== 'i' || c== 'o' || c=='u'){
                vowel++;
            }
            else {
                constant++;
            }
        }
        System.out.println("Vowel count: "+vowel);
        System.out.println("Constant count: "+constant);
    }
}
