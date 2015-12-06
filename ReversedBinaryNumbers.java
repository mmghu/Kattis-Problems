// Purpose: Convert a number to the reverse binary representation 
// Preconditions: One integer
// Postconditions: New integer that is the reverse binary representation of the original
import java.util.Scanner;

public class ReversedBinaryNumbers {
	public static void main(String[] args) {
		// Get user input
		Scanner reader = new Scanner(System.in);
		int num = Integer.parseInt(reader.nextLine());
		
		// Convert number to binary
		String binary = Integer.toBinaryString(num);
		
		// Reverse that string
		String reverseBinary = new StringBuilder(binary).reverse().toString();
		
		// Convert that string back to base 10
		int answer = Integer.parseInt(reverseBinary, 2);
		
		// Output answer to user
		System.out.println(answer);
		
	} // end main
} // end class
