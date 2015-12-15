// Purpose: Compare the length of two strings and determine which is longer
// Preconditions: Two strings
// Postconditions: Outputs "go" or "no" depending on input lengths
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aaah {
	public static void main(String[] args) throws IOException {
		// Create buffered reader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// Store the lengths of the two inputs
		int Jon = reader.readLine().length();
		int Doctor = reader.readLine().length();
		
		// Compare lengths of the strings and output results
		if(Doctor <= Jon){
			System.out.println("go");
		}
		else{
			System.out.println("no");
		}
		
	} // end main
} // end class
