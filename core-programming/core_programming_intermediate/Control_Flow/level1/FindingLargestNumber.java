package core_programming_intermediate.Control_Flow.level1;

import java.util.Scanner;

public class FindingLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a > b && a > c){
            System.out.println("First Number is Largest");
        }else if(a < b && b > c){
            System.out.println("Second Number is Largest");
        }else {
            System.out.println("Third Number is Largest");
        }
    }
}
