// Purpose: Calculate number of As and Bs in n amounts of permutations
// Preconditions: N representing how many permutations
// Postconditions: Two numbers separated by a space representing numbers of As and Bs
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rijeci {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Get number of permutations
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int a = 1;
		int b = 0;
		
		for(int i = 0; i < n; i++){
			int temp = a + b;
			a = b;
			b = temp;
		} // end loop
		
		System.out.println(a + " " + b);
		
		/*
		// Keep track of A and B
		int a = 0;
		int b = 0;
		StringBuilder curr = new StringBuilder("A");
		
		// Calculate permutations
		for(int i = 0; i < n; i++){
			for(int x = 0; x < curr.length(); x++){
				if(curr.charAt(x) == 'A'){curr.setCharAt(x,'B');}
				else if(curr.charAt(x) == 'B'){curr.insert(x, 'A'); x++;}
			} // end string loop
		} // end for loop
		
		// Count letters
		for(int i = 0; i < curr.length(); i++){
			if(curr.charAt(i) == 'A'){a++;}
			else{b++;}
		} // end for loop
		
		// Output results to the user
		System.out.println(a + " " + b);
		*/
		
	} // end main
} // end class
