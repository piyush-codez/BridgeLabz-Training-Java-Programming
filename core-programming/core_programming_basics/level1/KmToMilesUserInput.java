package core_programming_basics.level1;

import java.util.Scanner;

public class KmToMilesUserInput {
    public static void main(String[] args) {
         double kms;
         double miles;
        Scanner sc = new Scanner(System.in);
        kms = sc.nextDouble();
        miles = kms/1.6;
        System.out.println("The distance in kms is : " + kms + " " + "and in miles is : " + miles );
    }
}
