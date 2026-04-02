package core_programming_basics.elementary_coding.level2;

import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float perimeter = sc.nextFloat();
        float side = perimeter/4;
        System.out.println("Side of Square is : " + side);
    }
}