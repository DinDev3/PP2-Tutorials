import java.util.Scanner;

public class Task1LengthCent {
    public static void main(String[] args) {
        for(int i=0; i<3 ;i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length in centimetres: ");
            double value = input.nextDouble();

            double conversion = (value * 0.393);

            System.out.println(value + " centimetres converts into " + conversion + " inches");
        }
    }
}
