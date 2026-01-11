package Core_Java_Revision.Day_1;

public class Lab006 {
    public static void main(String[] args) {
        // Practice 7: Swap Two Numbers (With 3rd variable)
        // Swap two numbers using temp variable

        int a = 10, b = 20;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
