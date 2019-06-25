import java.util.Scanner;

public class Task2Nutrition {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter your weight (in Kilograms): ");
            double weight = input.nextDouble();

            System.out.print("Enter your height (in Metres): ");
            double height = input.nextDouble();

            double bMI = weight / (height * height);
            bMI = (double) Math.round(bMI*100)/100;

            System.out.println("Your BMI is: " + bMI);

            System.out.println("-----------------------------------");
        }
    }
}
