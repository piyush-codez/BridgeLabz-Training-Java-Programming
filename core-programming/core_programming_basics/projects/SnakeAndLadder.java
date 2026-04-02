package core_programming_basics.Projects;
import java.util.*;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int p1 = 0, p2 = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        // ladders
        map.put(3, 22);
        map.put(5, 8);
        map.put(11, 26);
        // snakes
        map.put(27, 1);
        map.put(21, 9);
        map.put(17, 4);

        int currPlayer = 1;
        boolean gameOver = false;

        System.out.println("🎲 Welcome to Snake and Ladder Game!");

        while (!gameOver) {
            System.out.println("\nPlayer " + currPlayer + ", press Enter to roll dice...");
            sc.nextLine();

            int dice = rand.nextInt(6) + 1;
            System.out.println("Dice rolled: " + dice);

            if (currPlayer == 1) {
                if (p1 + dice <= 100) {
                    p1 += dice;
                } else {
                    System.out.println("Move skipped! Need exact number to reach 100.");
                }

                System.out.println("Player 1 moves to : " + p1);

                if (map.containsKey(p1)) {
                    int newPos = map.get(p1); // ✅ optimized
                    if (p1 < newPos) {
                        System.out.println("🪜 Ladder! Climb up to " + newPos);
                    } else {
                        System.out.println("🐍 Snake! Slide down to " + newPos);
                    }
                    p1 = newPos;
                }

                if (p1 == 100) {
                    System.out.println("🎉 Player 1 Wins!");
                    gameOver = true;   // ✅ FIXED
                    break;             // ✅ stop loop
                }

                currPlayer = 2;

            } else {

                if (p2 + dice <= 100) {
                    p2 += dice;
                } else {
                    System.out.println("Move skipped! Need exact number to reach 100.");
                }

                System.out.println("Player 2 moves to : " + p2);

                if (map.containsKey(p2)) {
                    int newPos = map.get(p2); // ✅ optimized
                    if (p2 < newPos) {
                        System.out.println("🪜 Ladder! Climb up to " + newPos);
                    } else {
                        System.out.println("🐍 Snake! Slide down to " + newPos);
                    }
                    p2 = newPos;
                }

                if (p2 == 100) {
                    System.out.println("🎉 Player 2 Wins!");
                    gameOver = true;   // ✅ FIXED
                    break;             // ✅ stop loop
                }

                currPlayer = 1;
            }
        }

        sc.close();
    }
}