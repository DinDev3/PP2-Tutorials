import java.util.Scanner;

public class Task1VolumeLit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length in litres: ");
        double value = input.nextDouble();

        double conversion = (value *0.878);

        System.out.println(value + " litres converts into " + conversion + " quarts");

    }
}
