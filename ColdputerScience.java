// Purpose: Output number of days with sub zero temperatures
// Preconditions: Number of days on one line and temperatures separated by spaces on another
// Postconditions: Outputs number of days under 0 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColdputerScience {
	public static void main(String[] args) throws IOException {
		// Get user input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		reader.readLine(); // don't need temperature number
		String[] temperatures = reader.readLine().split(" ");
		
		// Initialize accumulator
		int acc = 0;
		
		// Loop through input
		for(int i = 0; i < temperatures.length; i++){
			if(Integer.parseInt(temperatures[i]) < 0){
				acc++; // increment accumulator
			}
		} // end input loop
		
		// Output number to the user
		System.out.println(acc);
		
	} // end main
} // end class
