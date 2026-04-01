package core_programming_basics.level1;

import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudent = sc.nextInt();
        int possibleHandshake = (numberOfStudent * (numberOfStudent-1) ) /2;
        System.out.println(possibleHandshake);
    }
}
