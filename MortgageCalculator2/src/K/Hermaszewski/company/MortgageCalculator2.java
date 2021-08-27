package K.Hermaszewski.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator2 {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int principal = 0;
        while (true) {
            System.out.print("Enter your principal: ");
            principal = data.nextInt();
            if (principal >= 1000 && principal <= 1000000) {
                break;
            } else {
                System.out.println("Principal must be a number between 1000 and 1000000");
            }
        }
        double interestRate = 0;
        while (true) {
            System.out.print("Enter your annual interest rate: ");
            interestRate = data.nextDouble();
            if (interestRate > 0 && interestRate < 30) {
                interestRate = (interestRate/100)/12;
                break;
            } else {
                System.out.println("Interest rate must be greater than 0 and less than 30 ");
            }
        }
        int numbersOfPayments = 0;
        while (true) {
            System.out.print("Enter how long is your mortgage? (in years): ");
            numbersOfPayments = data.nextInt();
            if (numbersOfPayments >= 1 && numbersOfPayments <= 30) {
                numbersOfPayments = numbersOfPayments * 12;
                break;
            } else {
                System.out.println("It must be a number between 1 and 1000000");
            }
        }

        double montlyPrincipial = principal * (interestRate * (Math.pow((1 + interestRate), numbersOfPayments)))
                / (((Math.pow((1 + interestRate), numbersOfPayments))) - 1);
        NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String result = euro.format(montlyPrincipial);
        System.out.println("Your monthly mortgage rate is: " + result);

    }
}