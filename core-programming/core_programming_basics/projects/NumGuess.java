package core_programming_basics.Projects;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) (Math.random() * 10 ) +1;
//        int n = 5;

        System.out.println("Welcome to the Game!!!");

        System.out.println("Now, Let's Guess a number between 1 to 10");

        int num = 0;
        for(int i  = 1; i <= 5; i++){
            System.out.print("Attempt " + i + " - Enter your guess: ");

            try {
                num = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                i--;
                continue;
            }

            if(num == n){
                System.out.println("Hurrayyy, You Wonnnnn!!!!!");
                System.out.println("You took only " + i + " attempt");
                return;
            }
            else if(num > n && i != 5){
                System.out.println("guessed Number is larger");
            }
            else if(num < n && i != 5){
                System.out.println("guessed Number is smaller");
            }
            else{
                System.out.println("Better Luck, Next Time!!!!");
                System.out.println("Your are out of attempts");
            }
        }
    }
}
