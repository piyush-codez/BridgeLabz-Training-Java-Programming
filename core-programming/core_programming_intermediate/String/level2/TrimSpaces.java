package core_programming_intermediate.String.level2;

import java.util.Scanner;

public class TrimSpaces {

    public static String trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ') {
            start++;
        }

        while (text.charAt(end) == ' ') {
            end--;
        }

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String userTrim = trimSpaces(text);
        String builtInTrim = text.trim();

        System.out.println("User-defined trim: '" + userTrim + "'");
        System.out.println("Built-in trim: '" + builtInTrim + "'");
    }
}
