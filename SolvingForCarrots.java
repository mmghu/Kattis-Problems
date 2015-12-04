// Purpose: Take input n times and output p
// Preconditions: Takes in n and p on the same line, then n lines of input
// Postconditions: Outputs p to the user
import java.lang.reflect.Array;
import java.util.Scanner;

public class SolvingForCarrots {
	public static void main(String[] args) {
		// Get initial input for N and P
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		
		// Split input into two values
		String[] inputList = input.split(" ");
		int n = Integer.parseInt(inputList[0]);
		int p = Integer.parseInt(inputList[1]);
		
		// Create array 
		String[] hufflePuffs = new String[n];
		
		// Take input
		for(int i = 0; i < n; i++){
			hufflePuffs[i] = reader.nextLine();
		}
		
		// Print P
		System.out.println(p);
	}// end main
}// end class
