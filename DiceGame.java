import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceGame {
	
	public static double avgRoll(String[] player){
		// Convert string array into variables
		int a = Integer.parseInt(player[0]);
		int b = Integer.parseInt(player[1]);
		int c = Integer.parseInt(player[2]);
		int d = Integer.parseInt(player[3]);
		
		// Sum of the two ranges
		int acc1 = 0; int acc2 = 0;
		for(int i = a; i <= b; i++){acc1 += i;}
		for(int i = c; i <= d; i++){acc2 += i;}
		
		// Return average roll
		return acc1/(b-a+1) + acc2/(d-c+1);
	} // end avgRoll
	
	public static void main(String[] args) throws IOException {
		// Get both dice rolls
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] Gunnar = reader.readLine().split(" ");
		String[] Emma = reader.readLine().split(" "); 
		
		// Calculate average rolls
		if(avgRoll(Gunnar) > avgRoll(Emma)){
			System.out.println("Gunnar");
		}
		else if(avgRoll(Gunnar) < avgRoll(Emma)){
			System.out.println("Emma");
		}
		else{
			System.out.println("Tie");
		}
		
	} // end main
} // end class
