import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double tax = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please try again.");
        }
        double income = sc.nextDouble();

        if (income > 180_000) {
            tax = (income - 180_000) * 0.45 + 54_547;
        } else if (income > 80_000) {
            tax = (income - 80_000) * 0.37 + 17_547;
        }else if (income > 37_000) {
            tax = (income - 37_000) * 0.325 + 3_572;
        }else if (income > 18_200) {
            tax = (income - 18_200) * 0.37 + 18_200;
        }

        System.out.println("Tax: "+tax);

    }
}
