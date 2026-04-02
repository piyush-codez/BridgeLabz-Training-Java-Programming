package core_programming_basics.elementary_coding.level2;

import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double d = a+b*c;
        double e = a*b+c;
        double f = c+a/b;
        double g = a%b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
