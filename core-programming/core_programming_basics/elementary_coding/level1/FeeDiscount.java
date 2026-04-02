package core_programming_basics.elementary_coding.level1;

public class FeeDiscount {
    public static void main(String[] args) {
        int fees = 124000;
        double discount = fees*0.1;
        double amount = fees - discount;
        System.out.println("The Discount amount is : INR " + discount +" " + "and final fee after discount is : INR " + amount);
    }
}
