// Purpose: Organize names by length in the shape of a bell curve
// Preconditions: Sets of names denoted by number of names until given 0 to stop
// Postconditions: Outputs sorted names by set
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SymmetricOrder {
	
	public static String[] clownSort(String[] unsorted){
		// Create two array lists
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		boolean alt = true;
		
		// Add things into two array lists
		for(int i = 0; i < unsorted.length; i++){
			if(alt){
				alt = false;
				list1.add(unsorted[i]);
			}
			else{
				alt = true;
				list2.add(unsorted[i]);
			}
		} // end for loop
		
		// Reverse list 2 and add it to list 1
		Collections.reverse(list2);
		list1.addAll(list2);
		
		// Convert array list to array
		String[] sorted = new String[list1.size()];
		list1.toArray(sorted);
		
		// Return sorted
		return sorted;
	} // end clownSort
	
	public static void main(String[] args) {
		// Get input from the user
		Scanner reader = new Scanner(System.in);
		int number = Integer.parseInt(reader.nextLine());
		
		// Create master array list
		ArrayList<String[]> MasterList = new ArrayList<String[]>();
		
		// Loop w/ sentinel logic
		while(number != 0){
			String[] input = new String[number];
			
			// Store words
			for(int i = 0; i < number; i++){
				input[i] = reader.nextLine();
			} // end input reading
			
			// Add to master list
			MasterList.add(clownSort(input));
			number = Integer.parseInt(reader.nextLine());
		} // end while loop
		
		// Output results of master list
		for(int m = 0; m < MasterList.size(); m++){
			System.out.println("SET " + (m+1));
			for(int i = 0; i < MasterList.get(m).length; i++){
				System.out.println(MasterList.get(m)[i]);
			} // end 1d loop
		} // end 2d loop
		
	} // end main
} // end class
