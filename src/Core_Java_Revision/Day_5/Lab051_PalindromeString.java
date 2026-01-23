package Core_Java_Revision.Day_5;

public class Lab051_PalindromeString {
    public static void main(String[] args) {
        String n = "dad";
        String rev = "";
        for (int i=n.length()-1; i>=0; i--){
            rev += n.charAt(i);
        }
        if (rev.equals(n)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
