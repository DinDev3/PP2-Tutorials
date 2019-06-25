import java.util.Scanner;

public class Task2TempFah {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter temperature in fahrenheit: ");
            double value = input.nextDouble();

            double conversion = ((value * 9) / 5) + 32;
            double roundedConv = (double) Math.round(conversion * 100) / 100;

            System.out.println(value + " celsius converts into " + roundedConv + " fahrenheit");
        }
    }
}
