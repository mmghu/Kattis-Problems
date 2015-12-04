// Purpose: Calculate iterations of changing any string to as many instances of 'Per' as possible
// Preconditions: Takes in an all caps string
// Postconditions: Number of days taken is output to the user
import java.util.Scanner;

public class CryptographersCondundrum {
	public static void main(String[] args) {
		// Get input from the user
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		
		// Create counter
		int counter = 1;
		int days = 0;
		
		// loop through input
		for(int i = 0; i < input.length(); i++){
			if(counter == 1 && input.charAt(i) != 'P'){
				days++;
			}
			if(counter == 2 && input.charAt(i) != 'E'){
				days++;
			}
			if(counter == 3 && input.charAt(i) != 'R'){
				days++;
			}
			counter++;
			if(counter == 4){
				counter = 1;
			}
		}// end for loop
		
		// Print days
		System.out.println(days);
		
	} // end main
}// end class
