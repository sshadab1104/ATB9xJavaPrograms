package Core_Java_Revision.Day_5;

public class Lab050_ReverseString {
    public static void main(String[] args) {
        String name = "shadab";
        String rev = "";
        for (int i=name.length()-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
