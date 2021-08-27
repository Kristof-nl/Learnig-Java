package K.Hermaszewski.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter your principal: ");
        int principal = data.nextInt();
        System.out.print("Enter your interest rate (for the whole year): ");
        double interestRate = (data.nextDouble() / 12)/100;
        System.out.print("Enter how long is your mortgage? (in years): ");
        int numbersOfPayments = data.nextInt() * 12;


        double montlyPrincipial = principal * (interestRate * (Math.pow((1 + interestRate), numbersOfPayments)))
                / (((Math.pow((1 + interestRate), numbersOfPayments))) - 1);
        NumberFormat euro = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String result = euro.format(montlyPrincipial);
        System.out.println("Your monthly mortgage rate is: " + result);

    }
}