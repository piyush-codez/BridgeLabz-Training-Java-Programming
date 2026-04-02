package core_programming_basics.elementary_coding.level2;

import java.util.Scanner;

public class TotalPriceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        double totalPrice = unitPrice*quantity;
        System.out.println("Total Price is : " + totalPrice);
    }
}
