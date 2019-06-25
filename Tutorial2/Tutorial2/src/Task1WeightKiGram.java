import java.util.Scanner;

public class Task1WeightKiGram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length in kilograms: ");
        double value = input.nextDouble();

        double conversion = (value *2.204);

        System.out.println(value + " kilograms converts into " + conversion + " pounds");

    }
}
