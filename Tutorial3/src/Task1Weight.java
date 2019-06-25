import java.util.Scanner;

public class Task1Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your requirement?");
        System.out.println("1. Convert Metric to Imperial");
        System.out.println("2. Convert Imperial to Metric");


        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Only integers are accepted.");
            sc.next();
        }

        int choice = sc.nextInt();

        Scanner input = new Scanner(System.in);

        if (choice == 1) {
            System.out.println("Enter length in grams: ");
            double value = input.nextDouble();

            double conversion = (value * 0.035);

            System.out.println(value + " grams converts into " + conversion + " ounces");


        } else if (choice == 2) {
            System.out.println("Enter length in ounces: ");
            double value = input.nextDouble();

            double conversion = (value * 28.35);

            System.out.println(value + " ounces converts into " + conversion + " grams");

        } else {
            System.out.println("Invalid choice");
        }

    }
}

