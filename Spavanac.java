// Purpose: Subtract 45 minutes from military time
// Preconditions: Hours and minutes separated by a space
// Postconditions: Outputs new time to the user separated by a space
import java.util.Scanner;

public class Spavanac {
	public static void main(String[] args) { 
		// Get input
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		
		// Format string into ints
		String[] inputList = input.split(" ");
		int hours = Integer.parseInt(inputList[0]);
		int minutes = Integer.parseInt(inputList[1]);
		
		// Subtract 45 minutes
		int diffM = minutes - 45;
		if(diffM < 0){
			// Calculate minutes
			minutes = 60 + diffM;
			
			// Calculate hours
			int diffH = hours - 1;
			if(diffH < 0){
				hours = 23;
			}
			else{
				hours--;
			}
		}
		else{
			minutes = diffM;
		}
		
		// Print adjusted time
		System.out.println(hours + " " + minutes);
		
	}// end main
}// end class
