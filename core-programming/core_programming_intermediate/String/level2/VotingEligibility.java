package core_programming_intermediate.String.level2;

import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("Age	Can Vote");

        for (int i = 0; i < 10; i++) {
            if (ages[i] >= 18) {
                System.out.println(ages[i] + "	true");
            } else {
                System.out.println(ages[i] + "	false");
            }
        }
    }
}
