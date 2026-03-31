package Java_Basic;

public class LoopsDemo {
    public static void main(String[] args) {

        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }

        // While loop
        int j = 1;
        while (j <= 3) {
            System.out.println("While Loop: " + j);
            j++;
        }

        // Do-while loop
        int k = 1;
        do {
            System.out.println("Do-While Loop: " + k);
            k++;
        } while (k <= 2);
    }
}