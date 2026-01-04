package Revision_If_Else;

import java.util.Scanner;

public class Rev_005 {
    // If cost price and selling price of an item is input through the keyboard, WAP to
    // determine weather the seller has made profit or incurred loss. Also determine how
    // much profit he made or loss he incurred?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price:");
        int CP =  sc.nextInt();
        System.out.println("Enter the Selling Price: ");
        int SP = sc.nextInt();
        if (CP<0 || SP<0){
            System.out.println("Invalid input");
        }
        else if (CP==SP){
            System.out.println("No Profit No Loss");
        } else if (SP>CP) {
            int p = SP-CP;
            System.out.println("Profit of Seller is: "+p);
        } else {
            int l = CP-SP;
            System.out.println("Loss incurred of Seller is: "+l);
        }

    }
}
