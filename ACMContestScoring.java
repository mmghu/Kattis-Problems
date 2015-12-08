// Purpose: Find the total problems solved and total timed measured given a teams submission history
// Preconditions: Answers formatted by minutes letter right/wrong until given -1
// Postconditions: Total problems solved and total time
import java.util.ArrayList;
import java.util.Scanner;

public class ACMContestScoring {
	public static void main(String[] args) {
		// Get input
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		
		// Tracking variables
		int solved = 0;
		int time = 0;
		ArrayList<String> problems = new ArrayList<String>();
		
		// Loop w/ sentinel logic
		while(!(line.equals("-1"))){
			// Split input into variables
			String[] data = line.split(" ");
			
			// If this is a correct evaluation
			if(data[2].equals("right")){
				solved++; // add to solved count
				
				// Split input
				String letter = data[1];
				int tempTime = Integer.parseInt(data[0]);
				
				// Go through all previous lines
				for(int i = 0; i < problems.size(); i++){
					if(problems.get(i).split(" ")[1].equals(letter)){
						tempTime += 20;
					}
				} // end for loop
				time += tempTime;
			}
			
			problems.add(line);
			line = reader.nextLine();
		} // end while loop
		
		// Output results to the user
		System.out.println(solved + " " + time);
		
	} // end main
} // end class
