import java.util.Scanner;

public class FavColor{
public static void main (String args[]){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your favourite color:");
	String color = in.nextLine();
	
	System.out.println("Your favourite colour is "+color);
}
}