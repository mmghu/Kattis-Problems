// Purpose: Convert improper fractions into mixed fractions
// Preconditions: Numerator and denominator separated by a space
// Postconditoins: Program outputs mixed fraction to the user
import java.util.ArrayList;
import java.util.Scanner;

public class MixedFractions {
	public static void main(String[] args) {
		// Get user input
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		
		// Store mixed fractions in an array list
		ArrayList<String> answers = new ArrayList<String>();
		
		// Loop input with sentinel logic
		while(!(line.trim().equals("0 0"))){
			// Turn string into ints
			String[] fraction = line.split(" ");
			int num = Integer.parseInt(fraction[0]); // numerator
			int den = Integer.parseInt(fraction[1]); // denominator
			
			int whole = num / den;
			num = num % den;
			
			answers.add("" + whole + " " + num + " / " + den);
			line = reader.nextLine();
		} // end while loop
		
		// Print answers to the user
		for(int i = 0; i < answers.size(); i++){
			System.out.println(answers.get(i));
		} // end output loop
		
	} // end main
} // end class
