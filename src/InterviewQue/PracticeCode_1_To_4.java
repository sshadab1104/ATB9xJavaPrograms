package InterviewQue;

public class PracticeCode_1_To_4 {
    public static void main(String[] args) {
        // Program 1: Print numbers 1 to 10
        for (int i=1; i<=10; i++){
            System.out.print(i+" ");
        }
        // Program 2: Print numbers 10 to 1
        System.out.println();
        int n = 10;
        while (n>0){
            System.out.print(n+" ");
            n--;
        }
        // Program 3: Print even numbers from 1 to 50
        System.out.println();
        for (int i=2; i<=50; i+=2){
            System.out.print(i+" ");
        }
        // Program 4: Print odd numbers from 1 to 50
        System.out.println();
        int odd = 1;
        while (odd<50){
            System.out.print(odd+" ");
            odd+=2;
        }
    }
}
