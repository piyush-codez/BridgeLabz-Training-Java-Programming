package core_programming_intermediate.String.level2;

import java.util.Scanner;

public class CharacterTypeDisplay {

    public static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Character	Type");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + "		" + checkCharacter(text.charAt(i)));
        }
    }
}