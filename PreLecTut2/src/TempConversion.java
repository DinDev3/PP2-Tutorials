import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting value: ");
        double start = input.nextDouble();

        System.out.print("Enter finishing value: ");
        double finish = input.nextDouble();

        System.out.print("Enter increment value: ");
        double increase = input.nextDouble();

        System.out.println("Celsius     Fahrenheit");
        System.out.println("----------------------");
        for (double i=start;i<=finish;i+=increase){
            double fahrenheit = (i*9/5)+32;
            System.out.println(start+"          "+fahrenheit);
        }
    }
}
