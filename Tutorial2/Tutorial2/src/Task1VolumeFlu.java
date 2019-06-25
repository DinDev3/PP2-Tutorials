import java.util.Scanner;

public class Task1VolumeFlu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length in fluid ounces: ");
        double value = input.nextDouble();

        double conversion = (value *28.413);

        System.out.println(value + " fluid ounces converts into " + conversion + " millilitres");

    }
}
