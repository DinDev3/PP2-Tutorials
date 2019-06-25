import java.util.Scanner;

public class Task2Geometry {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter the radius of the circle: ");
            double radius = input.nextDouble();

            double area = Math.PI * (radius * radius);
            double roundedArea = (double) Math.round(area * 100) / 100;

            double circumference = 2* Math.PI * (radius);
            double roundedCircum= (double) Math.round(circumference * 100) / 100;


            System.out.println("The area of the circle: "+roundedArea);
            System.out.println("The circumference of the circle: "+roundedCircum);

        }
    }
}
