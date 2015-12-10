// Purpose: Find the smallest positive integer p that will result in the same sum of digits when multiplied by n
// Preconditions: Positive integers until a 0
// Postconditions: Output p for each integer inputed
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EasiestProblemIsThisOne {
	
	public static int sum(int num){
		// Convert num into array of numbers
		String numString = Integer.toString(num);
		String[] numArray = numString.split("");
		int acc = 0;
		
		// Loop through numArray
		for(int i = 0; i < numArray.length; i++){
			acc += Integer.parseInt(numArray[i]);
		} // end for loop
		
		return acc;
	} // end sum
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Get user input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		ArrayList<Integer> answers = new ArrayList<Integer>();

		// Loop with sentinel logic
		while(num != 0){
			int desired = sum(num);
			int acc = 11;
			boolean found = false;
			while(!found){
				if(sum(num * acc) == desired){
					answers.add(acc);
					found = true;
				} // end if
				acc++;
			} // end while
			num = Integer.parseInt(reader.readLine());
		} // end while loop
		
		// Output answer
		for(int i = 0; i < answers.size(); i++){
			System.out.println(answers.get(i));
		} // end output loop
		
	} // end main
} // end class
