import java.util.Scanner;

public class Task1LengthKilo {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length in kilometres: ");
            double value = input.nextDouble();

            double conversion = (value * 0.621);

            System.out.println(value + " kilometres converts into " + conversion + " miles");
        }
    }
}
