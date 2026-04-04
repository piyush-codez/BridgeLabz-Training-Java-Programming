package core_programming_intermediate.Control_Flow.level1;

import java.util.Scanner;

public class CheckDivisibilityOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5 == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
