package Core_Java_Revision.Day_1;

public class Lab007 {
    public static void main(String[] args) {
        // Practice 8: Swap Two Numbers (Without 3rd variable)
        // Swap using + and -
        int a = 10, b = 20;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
