package core_programming_basics.elementary_coding.level2;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int d = a+b*c;
        int e = a*b+c;
        int f = c+a/b;
        int g = a%b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
