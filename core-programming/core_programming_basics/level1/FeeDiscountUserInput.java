package core_programming_basics.level1;

import java.util.Scanner;

public class FeeDiscountUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();
        double discount = (fee*discountPercent)/100;
        double feeAfterDiscount = fee - discount;
        System.out.println(feeAfterDiscount);
    }
}
