import java.util.Scanner;

public class Task2Finance {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter loan amount (in $): ");
            double amount = input.nextDouble();

            System.out.print("Enter annual interest rate (in %): ");
            double rate = input.nextDouble();

            System.out.print("Enter time period (in years): ");
            double years = input.nextDouble();

            double interest = amount*(rate/100)*years;
            interest = (double) Math.round(interest*100)/100;

            System.out.println("Your interest is: $" + interest);

            System.out.println("-----------------------------------");
        }
    }
}
