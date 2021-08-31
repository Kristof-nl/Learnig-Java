package K.Hermaszewski.company;

import java.util.Scanner;
import java.lang.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        while (true) {
            System.out.println("Available operations: add, subtract, multiply, divide, and alphabetize. ");
            System.out.println("Please write a name of one operation from above to start: ");
            String choice = data.next();
            if (choice.toUpperCase().equals("ADD")) {
                System.out.println("Please enter two integers: ");
                try {
                int a = data.nextInt();
                int b = data.nextInt();
                System.out.println("Answer: " + (a + b)); }
                catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                }
            }
        }
    }
}
