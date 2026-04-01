package core_programming_basics.level1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        float add = num1+num2;
        float sub = (num1 > num2) ? (num1 - num2) : (num2-num1);
        float div = num1/num2;
        float mul = num1*num2;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);

    }
}
