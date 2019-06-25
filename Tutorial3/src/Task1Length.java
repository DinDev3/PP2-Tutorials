import java.util.Scanner;

public class Task1Length {
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
            System.out.println("Enter length in kilometres: ");
            double value = input.nextDouble();

            double conversion = (value * 0.621);

            System.out.println(value + " kilometres converts into " + conversion + " miles");


        } else if (choice == 2) {
            System.out.println("Enter length in miles: ");
            double value = input.nextDouble();

            double conversion = (value * 1.609);

            System.out.println(value + " miles converts into " + conversion + " kilometres");

        } else {
            System.out.println("Invalid choice");
        }

    }
}
