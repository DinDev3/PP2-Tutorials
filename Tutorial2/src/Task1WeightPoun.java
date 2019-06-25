import java.util.Scanner;

public class Task1WeightPoun {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length in pounds: ");
            double value = input.nextDouble();

            double conversion = (value * 2.204);

            System.out.println(value + " pounds converts into " + conversion + " kilograms");
        }
    }
}