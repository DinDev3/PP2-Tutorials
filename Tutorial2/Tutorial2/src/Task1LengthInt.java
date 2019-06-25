import java.util.Scanner;

public class Task1LengthInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length in inches: ");
        double value = input.nextDouble();

        double conversion = (value*2.54);

        System.out.println(value+" inches converts into "+conversion+" centimetres");

    }
}
