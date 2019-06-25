import java.util.Scanner;

public class UserFriendliness {
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Do you really want to run the program? (yes/no)");
            String run = input.nextLine();

            run = run.toLowerCase();

            if (run.equals("y")){
                break;
            } else if(run.equals("n")){
                break;
            } else{
                System.out.println("Invalid input, please try again.");
            }
        }
    }
}
