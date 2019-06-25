import java.util.Scanner;

public class Task1LengthMet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length in metres: ");
        double value = input.nextDouble();

        double conversion = (value * 3.281);

        System.out.println(value + " metres converts into " + conversion + " feet");

    }
}