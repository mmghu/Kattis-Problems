// Purpuse: Replace duplicate letters in a word
// Preconditions: One word with or without duplicate letters
// Postconditions: Outputs word without duplicate letters
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apaxians {
	public static void main(String[] args) throws IOException {
		// Get input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = reader.readLine();
		
		// Remove duplicate letters (regex)
		System.out.println(word.replaceAll("(.)\\1{1,}", "$1"));
		
	} // end main
} // end class
