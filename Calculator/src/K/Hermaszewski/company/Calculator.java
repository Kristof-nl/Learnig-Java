package K.Hermaszewski.company;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        while (true) {
            System.out.println("Available operations: add, subtract, multiply, divide, and alphabetize. ");
            System.out.println("Please write a name of one operation from above to start: ");
            String choice = data.next();
            if (choice.toUpperCase().equals("ADD")) {
                System.out.println("Please enter two integers. Separate them with one space: ");
                try {
                    int a = data.nextInt();
                    int b = data.nextInt();
                    System.out.println("Answer: " + (a + b));
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            }
            else if (choice.toUpperCase().equals("SUBTRACT")) {
                System.out.println("Please enter two integers. Separate them with one space: ");
                try {
                    int a = data.nextInt();
                    int b = data.nextInt();
                    System.out.println("Answer: " + (a - b));
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            }
            else if (choice.toUpperCase().equals("MULTIPLY")) {
                System.out.println("Please enter two numbers. Separate them with one space: ");
                try {
                    double a = data.nextDouble();
                    double b = data.nextDouble();
                    System.out.printf("Answer: %.2f", (a * b));
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            }
            else if (choice.toUpperCase().equals("DIVIDE")) {
                System.out.println("Please enter two numbers. Separate them with one space: ");
                try {
                    double a = data.nextDouble();
                    double b = data.nextDouble();
                    if (a != 0 && b != 0) {
                        System.out.printf("Answer: %.2f", (a / b));
                    break; }
                    else {
                        System.out.println("Invalid input entered. Terminating...");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            }
            else if (choice.toUpperCase().equals("ALPHABETIZE")) {
                System.out.println("Please enter two strings. Separate them with one space: ");
                try {
                    String a = data.next();
                    String b = data.next();
                    int compare = a.toUpperCase().compareTo(b.toUpperCase());
                    if (compare < 0) {
                        System.out.printf(a + " comes before " + b + " alphabetically.");
                        break;
                    } else if (compare > 0) {
                        System.out.printf(b + " comes before " + a + " alphabetically.");
                        break;
                    } else {
                        System.out.printf("Chicken or Egg.");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
            }
            else {
                System.out.println("Invalid input entered. Terminating...");
                break;
            }
        }
    }
}
