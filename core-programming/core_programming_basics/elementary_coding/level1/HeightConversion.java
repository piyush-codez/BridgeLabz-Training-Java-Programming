package core_programming_basics.elementary_coding.level1;

import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightInCm = sc.nextDouble();
        double heightInInch = heightInCm/2.54;
        double heightInFeet = heightInInch/12;
        System.out.println("Height in Cm : " + heightInCm);
        System.out.println("Height in Inch : " + heightInInch);
        System.out.println("Height in Feet : " + heightInFeet);
    }
}
