// Purpose: Calculate which player has the highest probability of winning a game of summing two dice
// Preconditions: Properly formatted input detailing dice ranges of two players
// Postconditions: Outputs which player has the highest probability of winning in the event of no tie
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceGame {
	
	public static double sum(String[] player){
		// Convert string array into variables
		int a = Integer.parseInt(player[0]);
		int b = Integer.parseInt(player[1]);
		int c = Integer.parseInt(player[2]);
		int d = Integer.parseInt(player[3]);
		
		return a + b + c + d;
	} // end sum
	
	public static void main(String[] args) throws IOException {
		// Get both dice rolls
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] Gunnar = reader.readLine().split(" ");
		String[] Emma = reader.readLine().split(" "); 
		
		// Calculate average rolls
		if(sum(Gunnar) > sum(Emma)){
			System.out.println("Gunnar");
		}
		else if(sum(Gunnar) < sum(Emma)){
			System.out.println("Emma");
		}
		else{
			System.out.println("Tie");
		}
		
	} // end main
} // end class
