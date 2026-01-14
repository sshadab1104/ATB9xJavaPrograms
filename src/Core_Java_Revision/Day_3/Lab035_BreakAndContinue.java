package Core_Java_Revision.Day_3;

public class Lab035_BreakAndContinue {
    public static void main(String[] args) {
        // Program 15: break & continue
        for (int i=1; i<=10;i++){
            if (i==5)
                continue;
            if (i==8)
                break;
            System.out.print(i+" ");
        }
    }
}
