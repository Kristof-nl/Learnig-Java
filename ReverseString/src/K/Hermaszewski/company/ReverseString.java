package K.Hermaszewski.company;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write a phrase: ");
        String text = scanner.nextLine();
        System.out.println("Your phrase from reverse is: ");
        // Get a array length
        int arrayLength = text.length();
        // Get char array from phrase
        char[] arr = text.toCharArray();
        // Create an empty char array
        char[] reverseCharArray = new char[arrayLength];
        // Fill the empty char array
        for (int i = 0; i < arrayLength; i++ ) {
            reverseCharArray[i] = arr[arrayLength -1 - i];
        }
        System.out.println(reverseCharArray);
    }
}
