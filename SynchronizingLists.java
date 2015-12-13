// Purpose: Organize a list based on the order of the previous list
// Preconditions: Integer indicating lengths of two lists, then the two lists
// Postconditions: Outputs sorted second list
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SynchronizingLists {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Get user input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		
		// Create answers ArrayList
		ArrayList<ArrayList<Integer>> answers = new ArrayList<ArrayList<Integer>>();
		
		// While still looking for input
		while(num != 0){
			// Create arrays
			Integer[] sorted = new Integer[num];
			Integer[] unsorted = new Integer[num];
			
			// Get inputs
			for(int i = 0; i < num; i++){sorted[i] = Integer.parseInt(reader.readLine());} 
			for(int i = 0; i < num; i++){unsorted[i] = Integer.parseInt(reader.readLine());}
			
			// Create new arrays
			Integer[] sortedOriginal = sorted.clone();
			Integer[] unsortedOriginal = unsorted.clone();
			Arrays.sort(sorted);
			Arrays.sort(unsorted);
			ArrayList<Integer> master = new ArrayList<Integer>();
			
			// Find indices for master
			for(int i = 0; i < sortedOriginal.length; i++){
				master.add(Arrays.asList(sorted).indexOf(sortedOriginal[i]));
			}
			
			// Create final array
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int i = 0; i < master.size(); i++){
				temp.add(unsorted[master.get(i)]);
			}
			
			answers.add(temp);
			num = Integer.parseInt(reader.readLine());
		} // end while loop
		
		// Output answers to the user
		for(int i = 0; i < answers.size(); i++){
			for(int x = 0; x < answers.get(i).size(); x++){
				System.out.println(answers.get(i).get(x));
			}
			System.out.println("");
		} // end output loops
		
	} // end main
} // end class
