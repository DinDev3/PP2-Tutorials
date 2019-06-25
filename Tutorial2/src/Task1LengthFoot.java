import java.util.Scanner;

public class Task1LengthFoot {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length in feet: ");
            double value = input.nextDouble();

            double conversion = (value * 0.305);

            System.out.println(value + " feet converts into " + conversion + " metres");
        }
    }
}
