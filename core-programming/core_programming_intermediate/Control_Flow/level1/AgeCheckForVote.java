package core_programming_intermediate.Control_Flow.level1;

import java.util.Scanner;

public class AgeCheckForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("The person's age is " + age + " he/she can vote");
        }
        else{
            System.out.println("The person's age is " + age + " he/she can't vote");
        }
    }
}
