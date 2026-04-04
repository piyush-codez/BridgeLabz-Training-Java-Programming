package core_programming_intermediate.Control_Flow.level1;

import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula = " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both results are correct.");
            }
        } else {
            System.out.println("Please enter a natural number.");
        }
    }
}
