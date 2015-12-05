// Purpose: Calculate distance traveled for a car with a broken odometer
// Preconditions: Formatted data sets with speed in mph and total elapsed time
// Postconditions: Program outputs distance traveled to the user
import java.util.ArrayList;
import java.util.Scanner;

public class SpeedLimit {
	public static void main(String[] args) {
		// Get input from the user w/ sentinel logic
		Scanner reader = new Scanner(System.in);
		int pairs = Integer.parseInt(reader.nextLine());
		
		// Keep track of distances
		ArrayList<Integer> distances = new ArrayList<Integer>();
		
		while(pairs != -1){ // While still accepting input
			int distance = 0;
			int hours = 0;
			for(int i = 0; i < pairs; i++){
				String[] temp = reader.nextLine().split(" "); // Put input into a string
				distance += Integer.parseInt(temp[0]) * (Integer.parseInt(temp[1]) - hours); // distance is mph times new hours - old hours
				hours = Integer.parseInt(temp[1]); // keep track of current hours
			}
			distances.add(distance);
			pairs = Integer.parseInt(reader.nextLine());
		} // end while loop
		
		// Output data to the user
		for(int i = 0; i < distances.size(); i++){
			System.out.println(distances.get(i) + " miles");
		}
		
		// Closed the reader
		reader.close();
		
	}// end main
}// end class
