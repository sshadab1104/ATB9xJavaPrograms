package Core_Java_Revision.Day_2;

public class Lab018_SimpleCalculatorUsing_Switch {
    public static void main(String[] args) {
        // Program 8: Simple Calculator using switch
        // Input two numbers and operator (+, -, *, /) and perform operation using switch

        int a =70, b = 2;
        char op = '*';
        switch (op){
            case '+':
                System.out.println(a+b); break;
            case '-':
                System.out.println(a-b); break;
            case '*':
                System.out.println(a*b); break;
            case '/':
                System.out.println(a/b); break;
            case '%':
                System.out.println(a%b); break;
            default:
                System.out.println("Invalid input");

        }
    }
}
