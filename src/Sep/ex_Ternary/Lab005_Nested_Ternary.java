package Sep.ex_Ternary;

import org.w3c.dom.ls.LSOutput;

public class Lab005_Nested_Ternary {
    // result = condition1 ? expression1 : (condition2 ? expression 2 : expression3);
    public static void main(String[] args) {
        int score = 85;

        String grade = (score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C": (score>=60) ? "D" : "F";
        System.out.println("Your grade is: "+grade);
    }

}
