package core_programming_basics.elementary_coding.level1;

import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double disInYard = distance/3;
        double disInMile = disInYard/1760;
        System.out.println(distance);
        System.out.println(disInYard);
        System.out.println(disInMile);
    }
}
