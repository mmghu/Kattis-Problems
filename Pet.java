// Purpose: Determine which of 5 contestants win a culinary contest
// Preconditions: 5 rows representing 5 contestants with 5 scores on each row
// Preconditions: Outputs which contestant won and their total points
import java.util.Scanner;

public class Pet {
	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner(System.in);
		
		// Create tracking variables
		int largestScore = 0;
		int contestant = -1;
		
		// Loop through rows of input
		for(int i = 0; i < 5; i++){
			String[] list = reader.nextLine().split(" "); // Split scores into array
			int acc = 0; // accumulator
			
			for(int l = 0; l < list.length; l++){ // go through every score
				acc += Integer.parseInt(list[l]); // add up scores
			}
			
			if(acc > largestScore){ // if this is the largest score ive seen
				largestScore = acc; // its the new largest
				contestant = i + 1; // keep track of contestant (+1 b/c count starts at 0)
			}
		} // end loop
		
		// Output results to the user
		System.out.println(contestant + " " + largestScore);
		
	} // end main
} // end class
