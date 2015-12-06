// Purpose: Count number of distinct cities a person has traveled
// Preconditions: Number of cases n, followed by n instances of number of cities, then list of cities
// Postconditions: Outputs how many distinct cities that person has traveled to for each case
import java.util.ArrayList;
import java.util.Scanner;

public class IveBeenEverywhereMan {
	public static void main(String[] args) {
		// Get user input
		Scanner reader = new Scanner(System.in);
		int cases = Integer.parseInt(reader.nextLine());
		
		// Store answers into ArrayList
		ArrayList<Integer> answers = new ArrayList<Integer>();
		
		// Loop through cases
		for(int c = 0; c < cases; c++){
			// Get number of cities listed and keep track of cities seen
			int cities = Integer.parseInt(reader.nextLine());
			ArrayList<String> list = new ArrayList<String>();
			
			// Loop through cities
			for(int i = 0; i < cities; i++){
				String input = reader.nextLine(); // get current city
				if(!(list.contains(input))){ // if city not already in list
					list.add(input); // add to list
				} // end if
			} // end cities
			
			answers.add(list.size()); // add numbers of unique cities to list
		} // end cases
		
		// Output answer to the user
		for(int i = 0; i < answers.size(); i++){
			System.out.println(answers.get(i));
		} // end answers loop
	
	} // end main
} // end class
