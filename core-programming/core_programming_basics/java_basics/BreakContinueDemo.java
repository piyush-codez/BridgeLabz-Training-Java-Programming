package core_programming_basics.java_basics;

public class BreakContinueDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            if (i == 8) {
                break;
            }

            System.out.println(i);
        }
    }
}