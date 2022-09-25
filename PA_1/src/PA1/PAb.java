package PA1;
import java.util.Scanner;

public class PAb {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inches;
		System.out.println("Enter number of inches: ");
		inches = scanner.nextInt();
		
		int yr = inches % 36;
		int yards = (inches - yr) / 36; 
		System.out.println("Yards: " + yards);
		
		
		
		int feetr = yr % 12;
		int feet = (yr - feetr) / 12;
		System.out.println("Feet: " + feet); 
		
		
		System.out.println("Inches: " + feetr);
		
		
				
		
		
		
		
		
		
	}

}
