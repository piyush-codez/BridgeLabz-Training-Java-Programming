package core_programming_basics.elementary_coding.level2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        double areaInCm = 0.5*base*height;
        double areaInInch = areaInCm/2.54;

        System.out.println("Area in Cm : " + areaInCm);
        System.out.println("Area in Inch : " + areaInInch);

    }
}
