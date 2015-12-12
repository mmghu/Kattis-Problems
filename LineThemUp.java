// Purpose: Determine if a list of players are ascending, descending, or neither
// Preconditions: Number of players and that many player names
// Postconditions: Outputs if players are ascending, descending, or neither
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LineThemUp {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Get input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int players = Integer.parseInt(reader.readLine());
		ArrayList<String> names = new ArrayList<String>();
		
		// Loop through players
		for(int i = 0; i < players; i++){
			names.add(reader.readLine());
		} // end for loop
		
		// Initialize values
		boolean d,a;
		d = a = true;
		
		// Iterate through names
		for(int i = 0; i < names.size()-1; i++){
			if(names.get(i).compareTo(names.get(i+1)) < 0){
				d = false;
			}
			else{
				a = false;
			}
		} // end for loop
		
		// Output results
		if(d == false && a == false){
			System.out.println("NEITHER");
		}
		else if(d){
			System.out.println("DECREASING");
		}
		else{
			System.out.println("INCREASING");
		}
		
	} // end mains
} // end class
