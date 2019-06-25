public class Question13{
public static void main(String args[]){
	double number = 1234567.456d;
	String numberAsStr = String.format("%,.f", number);
	System.out.println(numberAsStr);
}
}