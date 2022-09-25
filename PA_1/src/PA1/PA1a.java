package PA1;
import java.util.Scanner;

public class PA1a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int yards, feet, inches;
		System.out.println("Enter number of yards: ");
		yards = scanner.nextInt();
		
		System.out.println("Enter number of feet: ");
		feet = scanner.nextInt();
		
		System.out.println("Enter number of inches: ");
		inches = scanner.nextInt();
		
		int y2i = yards * 36;
		int f2i = feet * 12;
		int totalinch = inches + y2i + f2i;
		System.out.println("Your total inches is: " + totalinch);
	}  
}
