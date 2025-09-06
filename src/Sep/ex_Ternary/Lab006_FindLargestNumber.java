package Sep.ex_Ternary;

public class Lab006_FindLargestNumber {
    public static void main(String[] args) {
        int a = 120, b = 15, c=20;
        int largest = (a>b)
                    ? (a>c ? a : c)
                    : (b>c ? b : c);
        System.out.println(largest);
    }
}
