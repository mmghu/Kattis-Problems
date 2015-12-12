// Purpose: Identify actions to take in a game of Simon Says
// Preconditions: Number of actions and those actions
// Postconditions: Outputs actions to play
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SimonSays {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Get user input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cmds = Integer.parseInt(reader.readLine());
		
		// List of actions to output later
		ArrayList<String> actions = new ArrayList<String>();
		
		// Loop through inputs
		for(int i = 0; i < cmds; i++){
			// Split sentence into words
			String[] sentence = reader.readLine().split(" ");

			// If first two words are simon says and has at least 2 words
			if(sentence.length > 2){
				if((sentence[0] + sentence[1]).equals("Simonsays")){
					// Build the rest of the string into a string
					StringBuilder temp = new StringBuilder();
					for(String s : Arrays.copyOfRange(sentence,2,sentence.length)) {
					    temp.append(s + " ");
					} // end for loop
					
					// Add resulting string to actions
					actions.add(temp.toString());
				} // end if statement
			}
		} // end for loop
		
		// Output commands to the user
		for(int i = 0; i < actions.size(); i++){
			System.out.println(actions.get(i).trim());
		} // end for loop	
		
	} // end main
} // end class
