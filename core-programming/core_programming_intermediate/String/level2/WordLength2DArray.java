package core_programming_intermediate.String.level2;
import java.util.Scanner;

public class WordLength2DArray {

    public static String[] splitText(String text) {
        return text.split(" ");
    }

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] result = getWordLengths(words);

        System.out.println("Word	Length");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "	" + Integer.parseInt(result[i][1]));
        }
    }
}
