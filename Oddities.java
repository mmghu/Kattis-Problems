// Purpose: Take a list of numbers and output if they are even or odd
// Preconditions: How many inputs there will be and that many numbers
// Postconditions: Outputs if the numbers are even or odd
import java.util.Scanner;

public class Oddities {
	public static void main(String[] args) {
		// Get initial input
		Scanner reader = new Scanner(System.in);
		int lines = Integer.parseInt(reader.nextLine());
		
		// Create array
		int[] numbers = new int[lines];
		
		// Get numbers list
		for(int i = 0; i < lines; i++){
			numbers[i] = Integer.parseInt(reader.next());
		}
		
		// Output even or odd
		for(int i = 0; i < lines; i++){
			if(numbers[i] % 2 == 0){
				System.out.println(numbers[i] + " is even");
			}
			else{
				System.out.println(numbers[i] + " is odd");
			}
		} // end for loop
		
	}// end main
}// end class
