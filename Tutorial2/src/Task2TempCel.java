import java.util.Scanner;

public class Task2TempCel {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter temperature in Celsius: ");
            double value = input.nextDouble();

            double conversion = (value - 32) * 5 / 9;
            double roundedConv = (double) Math.round(conversion * 100) / 100;

            System.out.println(value + " fahrenheit converts into " + roundedConv + " celsius");
        }
    }
}
