import java.util.Scanner;

public class Task1WeightOunc {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length in ounces: ");
            double value = input.nextDouble();

            double conversion = (value * 28.35);

            System.out.println(value + " ounces converts into " + conversion + " grams");
        }
    }
}