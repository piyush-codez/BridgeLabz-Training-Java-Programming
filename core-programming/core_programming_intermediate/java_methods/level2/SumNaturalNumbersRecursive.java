package core_programming_intermediate.java_methods.level2;

import java.util.Scanner;

public class SumNaturalNumbersRecursive {
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }

        return n + findSumRecursive(n - 1);
    }

    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int recursiveSum = findSumRecursive(n);
            int formulaSum = findSumFormula(n);

            System.out.println("Sum using recursion = " + recursiveSum);
            System.out.println("Sum using formula = " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Both results are correct.");
            }
        } else {
            System.out.println("Please enter a natural number.");
        }
    }
}
