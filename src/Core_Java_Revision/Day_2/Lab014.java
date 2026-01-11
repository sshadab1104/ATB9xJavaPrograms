package Core_Java_Revision.Day_2;

public class Lab014 {
    public static void main(String[] args) {
        // Program 4: Largest of Three Numbers.
        // Input three numbers and find the largest using if-else

        int a = 110, b = 220, c = 30;
        if(a>b && a>c){
            System.out.println(a+" is largest.");
        } else if (b>c) {
            System.out.println(b+" is largest");
        } else {
            System.out.println(c+" is largest");
        }

    }
}
