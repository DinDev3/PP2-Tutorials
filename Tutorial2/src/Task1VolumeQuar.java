import java.util.Scanner;

public class Task1VolumeQuar {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length in quarts: ");
            double value = input.nextDouble();

            double conversion = (value * 1.137);

            System.out.println(value + " quarts converts into " + conversion + " litres");
        }
    }
}
