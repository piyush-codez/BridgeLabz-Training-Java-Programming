package core_programming_intermediate.String.level1;

import java.util.Scanner;

public class StringToCharArray {

    public static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.print("User-defined array: ");
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Built-in array: ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Are both arrays same? " + compareArrays(userArray, builtInArray));
    }
}
