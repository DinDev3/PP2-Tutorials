import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Did you pass the exam? (y/n)");
        String pass = sc.nextLine();

        pass = pass.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your mark: ");

        while (!input.hasNextInt()) {
            System.out.println("Only integers are accepted as input.\nPlease try again.");
            input.next();               //removing the non-integer that was entered.
        }
        int mark = input.nextInt();


        System.out.print("Grade: ");
        if (mark >= 80) {
            if(pass.equals("n")) {
                System.out.println("FI (Fail/Incomplete)");
            }else {
                System.out.println("A");
            }

        } else if (mark >= 70) {
            if(pass.equals("n")) {
                System.out.println("FI (Fail/Incomplete)");
            }else {
                System.out.println("B");
            }

        } else if (mark >= 60) {
            if(pass.equals("n")) {
                System.out.println("FI (Fail/Incomplete)");
            } else {
                System.out.println("C");
            }

        } else if (mark >= 50) {
            if(pass.equals("n")) {
                System.out.println("FI (Fail/Incomplete)");
            } else {
                System.out.println("S (Pass)");
            }

        } else {
            System.out.println("F");
        }
    }

}