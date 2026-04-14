package core_programming_intermediate.String.level2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println("Game	User	Computer	Winner");

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();

            String computer = getComputerChoice();
            String winner = findWinner(user, computer);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            System.out.println(i + "	" + user + "	" + computer + "		" + winner);
        }

        double userPercentage = (userWins * 100.0) / games;
        double computerPercentage = (computerWins * 100.0) / games;

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("User Win Percentage: " + userPercentage + "%");
        System.out.println("Computer Win Percentage: " + computerPercentage + "%");
    }
}