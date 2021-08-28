package K.Hermaszewski.company;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write a phrase: ");
        String phrase = scanner.nextLine();
        System.out.println("Your phrase from reverse is: ");
        // Get a string length
        int stringLength = phrase.length();
        // Create an empty string
        char[] charArray = new char[stringLength];
        String output = "";
        for (int i = stringLength - 1; i >= 0; i-- ) {
            output = output + phrase.charAt(i);
        }
        System.out.println(output);
    }
}
