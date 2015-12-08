// Purpose: Decode scrambled messages that after any vowel add p and the same vowel
// Preconditions: One properly formatted scambled message
// Postconditions: Descrambled message
import java.util.Arrays;
import java.util.Scanner;

public class Kemija {
	
	public static String decode(String word){
		// easiest way to do this given finite permutations
		word = word.replace("apa","a");
		word = word.replace("epe","e");
		word = word.replace("ipi","i");
		word = word.replace("opo","o");
		word = word.replace("upu","u");
		return word;
	} // end decode function
	
	public static void main(String[] args) {
		// Get input from the user
		Scanner reader = new Scanner(System.in);
		String[] words = reader.nextLine().split(" ");
		String translation = "";
		
		// Decode words
		for(int i = 0; i < words.length; i++){
			translation += decode(words[i]) + " ";
		} // end for loop
		
		// Output decoded words back
		System.out.println(translation.trim());
		
	} // end main
} // end class
