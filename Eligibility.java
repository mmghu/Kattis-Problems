// Purpose: Determine if a student is eligible to compete in a contest
// Preconditions: Number of inputs and formatted input w/ name YYYY/MM/DD YYYY/MM/DD courses
// Postconditions: Outputs contestant eligibility
import java.util.ArrayList;
import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		// Get initial input
		Scanner reader = new Scanner(System.in);
		int lines = Integer.parseInt(reader.nextLine());
		
		// Store results in ArrayList
		ArrayList<String> results = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		
		// Get contestant list
		for(int i = 0; i < lines; i++){
			// Split input into inputList
			String rawInput = reader.nextLine();
			String[] inputList = rawInput.split(" ");
			
			// Convert inputList into variable
			int studiesYear = Integer.parseInt((inputList[1].split("/"))[0]);
			int birthYear = Integer.parseInt((inputList[2].split("/"))[0]);
			int courses = Integer.parseInt(inputList[3]);
			names.add(inputList[0]);
			
			// Determine eligibility
			if(studiesYear >= 2010){
				results.add("eligible");
			}
			else if(birthYear >= 1991){
				results.add("eligible");
			}
			else if(courses >= 41){
				results.add("ineligible");
			}
			else{
				results.add("coach petitions");
			}
		} // end for loop
		
		// Output results
		for(int i = 0; i < results.size(); i++){
			System.out.println(names.get(i) + " " + results.get(i));
		} // end output loop
		
	} // end main
} // end class
