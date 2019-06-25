import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("a. How many lines? ");
        int turns = input.nextInt();

        for (int i = 0; i <= turns; i++) {
            for (int n = 0; n < i; n++)
                System.out.print('*');

            System.out.println();
        }

        System.out.print("a. How many lines? ");
        turns = input.nextInt();



        }
    }
}
