import java.util.Scanner;

public class Task1LengthInt {
    public static void main(String[] args){
        for(int i=0; i<3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter length in inches: ");
            double value = input.nextDouble();

            double conversion = (value * 2.54);

            System.out.println(value + " inches converts into " + conversion + " centimetres");
        }
    }
}
