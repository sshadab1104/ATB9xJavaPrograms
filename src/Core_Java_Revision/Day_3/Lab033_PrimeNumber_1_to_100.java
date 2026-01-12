package Core_Java_Revision.Day_3;

public class Lab033_PrimeNumber_1_to_100 {
    public static void main(String[] args) {
        // Program 13: Prime Numbers 1 to 100
        for (int i=2; i<=100; i++){
            boolean isPrime = true;
            for (int j=2; j<=i/2; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }

}
