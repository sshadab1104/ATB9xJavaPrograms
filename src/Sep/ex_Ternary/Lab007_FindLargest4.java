package Sep.ex_Ternary;

public class Lab007_FindLargest4 {
    public static void main(String[] args) {
        // result = condition1 ? expression1 : (condition2 ? expression 2 : expression3);
        int a=5, b=10, c=15, d=20;
        int largest = (a>b
                ?(a>c ? (a>d ? a:d ):(c>d? c:d))
                :(b>c ? (b>d ? b:d ):(c>d? c:d)));
        System.out.println(largest);

    }
}
