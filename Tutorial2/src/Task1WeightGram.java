import java.util.Scanner;

public class Task1WeightGram {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length in grams: ");
            double value = input.nextDouble();

            double conversion = (value * 0.035);

            System.out.println(value + " grams converts into " + conversion + " ounces");
        }
    }
}
