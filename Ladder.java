// Purpose: Calculate and output minimum possible length of a ladder
// Preconditions: Properly formatted input containing height and maximum angle
// Postconditions: Outputs shortest possible length rounded up to the user as an int
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ladder {
	public static void main(String[] args) throws IOException {
		// Get input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		
		// Convert input to variables
		int height = Integer.parseInt(input[0]);
		int angle = Integer.parseInt(input[1]);
		
		// Convert to radians
		double angleR = Math.toRadians(angle);
		
		// Calculate value and 
		int shortestLength = (int) Math.ceil(height / Math.sin(angleR));
		
		// Output shortest length to the user
		System.out.println(shortestLength);
		
	} // end main
} // end class
